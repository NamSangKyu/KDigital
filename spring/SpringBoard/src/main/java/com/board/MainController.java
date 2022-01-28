package com.board;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.board.dto.BoardDTO;
import com.board.dto.MemberDTO;
import com.board.service.BoardService;
import com.board.service.MemberService;
import com.board.vo.PaggingVO;

@Controller
public class MainController {
	private MemberService memberService;
	private BoardService boardService;
	
	
	
	public MainController(MemberService memberService, BoardService boardService) {
		super();
		this.memberService = memberService;
		this.boardService = boardService;
	}

	@RequestMapping("/")
	public String main() {
		return "index";
	}
	
	@RequestMapping("/login.do")
	public String login(HttpServletRequest request, 
			HttpServletResponse response, HttpSession session) throws IOException {
		String id = request.getParameter("id");
		String passwd = request.getParameter("passwd");
		
		MemberDTO dto = memberService.login(id,passwd);
		
		if(dto == null) {
			response.setContentType("text/html;charset=utf-8");
			response.getWriter().write("<script>alert('아이디 비밀번호 확인하세요');"
					+ " history.back();</script>");
			return null;
		}
		session.setAttribute("member", dto);
		return "redirect:main.do";
	}
	
	@RequestMapping("main.do")
	public String boardList(HttpServletRequest request) {
		int page = 1;
		
		if(request.getParameter("page") != null) {
			page = Integer.parseInt(request.getParameter("page"));
		}
		
		List<BoardDTO> list = boardService.selectBoardList(page);
		request.setAttribute("list", list);
		//페이징 데이터 셋팅
		int count = boardService.selectAllCount();
		
		PaggingVO vo = new PaggingVO(count, page, 7, 4);
		request.setAttribute("pagging", vo);
		
		return "board_list";
	}
	
	@RequestMapping("writeView.do")
	public String writeView() {
		return "board_write";
	}
	
	@RequestMapping("write.do")
	public String write(HttpServletRequest request, HttpSession session) {
		String title = request.getParameter("title");		
		String content = request.getParameter("content");
		String writer = ((MemberDTO)session.getAttribute("member")).getId();
		boardService.insertBoard(new BoardDTO(title, content, writer));
		return "redirect:main.do";
	}
	
	@RequestMapping("logout.do")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
	
	@RequestMapping("boardView.do")
	public String boardView(HttpServletRequest request, HttpSession session) {
		int bno = Integer.parseInt(request.getParameter("bno"));
		
		BoardDTO dto = boardService.selectBoard(bno);
		request.setAttribute("dto", dto);

		//게시글 중복 조회수 증가 제거
		HashSet<Integer> set = (HashSet<Integer>) session.getAttribute("pageSet");
		if(set == null) {
			set = new HashSet<Integer>();
			session.setAttribute("pageSet", set);
		}
		if(set.add(bno)) {		
			boardService.addCount(bno);
		}
		
		return "board_view";
	}
	
	@RequestMapping("boardUpdateView.do")
	public String boardUpdateView(HttpServletRequest request) {
		int bno = Integer.parseInt(request.getParameter("bno"));
		
		BoardDTO dto = boardService.selectBoard(bno);
		request.setAttribute("dto", dto);
		return "board_update_view";
	}
	
	@RequestMapping("update.do")
	public String update(HttpServletRequest request) {
		int bno = Integer.parseInt(request.getParameter("bno"));
		String title = request.getParameter("title");		
		String content = request.getParameter("content");
		
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("bno", bno);
		map.put("title", title);
		map.put("content", content);
		
		boardService.updateBoard(map);
		
		return "redirect:boardView.do?bno="+bno;
	}
	
	@RequestMapping("boardDelete.do")
	public String boardDelete(HttpServletRequest request) {
		int bno = Integer.parseInt(request.getParameter("bno"));
		boardService.deleteBoard(bno);
		return "redirect:main.do";
	}
	
	@RequestMapping("boardLike.do")
	public String boardLike(HttpServletRequest request, HttpServletResponse response, HttpSession session) throws IOException {
		int bno = Integer.parseInt(request.getParameter("bno"));
		String id = ((MemberDTO)session.getAttribute("member")).getId();
		
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("id", id);
		map.put("bno", bno);
		
		int count = 0;
		try {
			count = boardService.insertBoardLike(map);
		}catch (Exception e) {
			boardService.deleteBoardLike(map);
		}
		JSONObject obj = new JSONObject();
		obj.put("result", count);
		obj.put("count", boardService.selectBoardLike(bno));
		
		response.getWriter().write(obj.toString());
		
		return null;
	}
	@RequestMapping("boardHate.do")
	public String boardHate(HttpServletRequest request, HttpServletResponse response, HttpSession session) throws IOException {
		int bno = Integer.parseInt(request.getParameter("bno"));
		String id = ((MemberDTO)session.getAttribute("member")).getId();
		
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("id", id);
		map.put("bno", bno);
		
		int count = 0;
		try {
			count = boardService.insertBoardHate(map);
		}catch (Exception e) {
			boardService.deleteBoardHate(map);
		}
		JSONObject obj = new JSONObject();
		obj.put("result", count);
		obj.put("count", boardService.selectBoardHate(bno));
		
		response.getWriter().write(obj.toString());
		
		return null;
	}
}















