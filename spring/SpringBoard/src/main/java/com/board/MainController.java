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
		return "redirect:boardList.do";
	}
	
	@RequestMapping("boardList.do")
	public String boardList(HttpServletRequest request) {
		int page = 1;
		
		if(request.getParameter("page") != null) {
			page = Integer.parseInt(request.getParameter("page"));
		}
		
		List<BoardDTO> list = boardService.selectBoardList(page);
		request.setAttribute("list", list);
		return "board_list";
	}
}








