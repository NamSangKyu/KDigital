package org.mvc;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.JSONArray;
import org.mvc.dto.StudentDTO;
import org.mvc.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	private StudentService studentService;
	
	public MainController(StudentService studentService) {
		this.studentService = studentService;
		
	}

	@RequestMapping("/")
	public String main() {
		System.out.println("메인 페이지 이동");
		return "main";
	}
	
	@RequestMapping("/login.do")
	public String login(HttpServletRequest request, HttpSession session,
			HttpServletResponse response) throws IOException {
		String sno = request.getParameter("sno");
		String name = request.getParameter("name");
		
		System.out.println(sno + " " + name);
		StudentDTO dto = studentService.login(sno, name);
		if(dto == null) {
			response.setContentType("text/html;charset=utf-8");
			response.getWriter().write("<script>alert('학번과 이름을 확인하세요');history.back();</script>");
			return null;//페이지 이동 X
		}
		session.setAttribute("dto", dto);

		return "redirect:list.do";
	}
	
	@RequestMapping("/list.do")
	public String list(HttpServletRequest request) {
		//전체 데이터가지고 와서 셋팅
		ArrayList<StudentDTO> list = studentService.selectAllStudnet();
		ArrayList<HashMap<String, Object>> major = studentService.selectAllMajor();
		
		request.setAttribute("list", list);
		request.setAttribute("major", major);
		
		
		return "student_list";
	}
	
	@RequestMapping("/register.do")
	public String register(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String sno = request.getParameter("sno");
		String name= request.getParameter("name");
		int major= Integer.parseInt(request.getParameter("major"));
		double score = Double.parseDouble(request.getParameter("score"));
		
		int count = studentService.insertStudent(new StudentDTO(sno, name, major, score));
		if(count == 0) {
			response.setContentType("text/html;charset=utf-8");
			response.getWriter().write("<script>alert('학생정보 등록 실패 입력하신 데이터를 확인하세요');history.back();</script>");
			return null;//페이지 이동 X
		}
		return "redirect:list.do";
	}
	
	@RequestMapping("/delete.do")
	public String delete(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html;charset=utf-8");
		String sno = request.getParameter("sno");
		int count = studentService.deleteStudent(sno);
		if(count == 0)
			response.getWriter().write("<script>alert('학생정보 삭제 실패');"
					+ "location.href='/list.do'</script>");
		else
			response.getWriter().write("<script>alert('학생정보 삭제 성공');"
					+ "location.href='/list.do'</script>");
		return null;
	}
	
	@RequestMapping("/updateView.do")
	public String updateView(HttpServletRequest request) {
		String sno = request.getParameter("sno"); 
		
		StudentDTO dto = studentService.selectStudent(sno);
		ArrayList<HashMap<String, Object>> major = studentService.selectAllMajor();
		
		request.setAttribute("major", major);
		request.setAttribute("obj", dto);
		
		return "student_update";
	}
	
	@RequestMapping("/update.do")
	public String update(HttpServletRequest request) {
		String sno = request.getParameter("sno");
		String name= request.getParameter("name");
		int major= Integer.parseInt(request.getParameter("major"));
		double score = Double.parseDouble(request.getParameter("score"));
		
		int count = studentService.updateStudent(new StudentDTO(sno, name, major, score));
		return "redirect:list.do";
	}
	
	@RequestMapping("/search.do")
	public String search(HttpServletRequest request, HttpServletResponse response) throws IOException{
		System.out.println("search.do");
		String name= request.getParameter("search");
		System.out.println(name);
		ArrayList<StudentDTO> list = studentService.selectListStudnet(name);
		System.out.println(list.toString());
		JSONArray arr = new JSONArray(list);
		
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().write(arr.toString());
		
		
		return null;
	}
}










