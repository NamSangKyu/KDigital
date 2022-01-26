package org.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	@RequestMapping("/")
	public String main() {
		System.out.println("메인 페이지 이동");
		return "main";
	}
	
	@RequestMapping("/login.do")
	public String login(HttpServletRequest request, HttpSession session) {
		String sno = request.getParameter("sno");
		String name = request.getParameter("name");
		
		System.out.println(sno + " " + name);
		
		return "student_list";
	}
}






