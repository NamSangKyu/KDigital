package com.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web.dto.MemberDTO;
import com.web.service.MemberService;

@Controller
public class MainController {
	private MemberService service;

	public MainController(MemberService service) {
		this.service = service;
	}
	
	@RequestMapping("/")
	public String main(HttpServletRequest request) {
		List<MemberDTO> list = service.selectAllMember();
		request.setAttribute("list", list);
		return "member_list";
	}
	
	@RequestMapping("/insert.do")
	public String insert(HttpServletRequest request) {
		String id = request.getParameter("id");
		String passwd = request.getParameter("passwd");
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		
		int count = service.insertMember(new MemberDTO(id, passwd, name, age));
		System.out.println("추가 결과 : "+count);
		
		return "redirect:/";
	}
	
	@RequestMapping("/delete.do")
	public String delete(HttpServletRequest request) {
		String id = request.getParameter("id");
		int count = service.deleteMember(id);
		System.out.println("삭제 결과 : " + count);
		return "redirect:/";
	}
	
	@RequestMapping("/updateView.do")
	public String updateView(HttpServletRequest request) {
		String id = request.getParameter("id");
		MemberDTO dto = service.selectMember(id);
		request.setAttribute("dto", dto);	
		
		return "member_update";
	}
	
	@RequestMapping("/update.do")
	public String update(HttpServletRequest request) {
		String id = request.getParameter("id");
		String passwd = request.getParameter("passwd");
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		
		int count = service.updateMember(new MemberDTO(id, passwd, name, age));
		System.out.println("추가 결과 : "+count);
		
		return "redirect:/";
	}
	@RequestMapping("/search.do")
	public String search(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html;charset=utf-8");
		String search = request.getParameter("search");
		List<MemberDTO> list = service.selectListMember(search);
		JSONArray arr = new JSONArray(list);
		response.getWriter().write(arr.toString());
		return null;
	}
	
}










