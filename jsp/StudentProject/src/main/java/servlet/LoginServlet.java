package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dto.StudentDTO;
import service.StudentService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String sno = request.getParameter("sno");
		String name = request.getParameter("name");
		
		StudentDTO dto = StudentService.getInstance().login(sno,name);
		if(dto != null) {
			//세션 처리
			HttpSession session = request.getSession();
			session.setAttribute("dto", dto);
			ArrayList<StudentDTO> list = StudentService.getInstance().selectAllStudnet();
			//전체 학생 데이터 셋팅
			request.setAttribute("list", list);
			response.sendRedirect("student_list.jsp");
			
		}else {
			//응답, 한글 처리
			response.setContentType("text/html;charset=utf-8");
			response.getWriter().write("<script>alert('학번과 이름을 확인하세요');"
					+ "history.back();</script>");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		doGet(request, response);
	}

}



