package com.board;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
}















