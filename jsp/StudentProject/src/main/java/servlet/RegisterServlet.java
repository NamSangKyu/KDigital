package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.StudentDTO;
import service.StudentService;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String sno = request.getParameter("sno");
		String name = request.getParameter("name");
		int major = Integer.parseInt(request.getParameter("major"));
		double score = Double.parseDouble(request.getParameter("score"));
		
		int count = StudentService.getInstance().insertStudent(
				new StudentDTO(sno, name, major, score));
		if(count == 0) {
			//데이터 추가 실패
			response.setContentType("text/html;charset=utf-8");
			response.getWriter().write("<script>alert('학생정보 등록에 실패');"
					+ "history.back();</script>");
		}else {
			//데이터 추가 성공
			response.sendRedirect("SelectAllServlet");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		doGet(request, response);
	}

}
