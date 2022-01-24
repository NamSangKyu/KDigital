package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StringServlet
 */
@WebServlet("/StringServlet")
public class StringServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StringServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//클라이언트가 보낸 데이터를 받는 부분 - 기존 폼에서 보낸 것을 받는 방식과 동일
		String data = request.getParameter("data");
		System.out.println(data);
		//클라이언트로 데이터를 전송
		response.setContentType("text/html;charset=utf-8");//한글설정
		//response.getWriter().write("리턴된 문자열 데이터");
		//데이터를 4개 보낼 경우
		response.getWriter().write("Hello,World,TEST,AAAA");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
