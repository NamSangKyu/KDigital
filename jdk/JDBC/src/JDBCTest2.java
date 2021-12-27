import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest2 {
	//전체 학생 정보 읽기
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			//1. Driver Load
			Class.forName("oracle.jdbc.OracleDriver");
			//2. DB Connect
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe",
					"scott", "tiger");
			//3. SQL 작성
			stmt = conn.createStatement();
			String sql = "select s.student_no, s.name, m.major_name,s.score "
					+ "from student s, major m where s.major_no = m.major_no";
			//4. SQL 실행
			rs = stmt.executeQuery(sql);
			//5. 조회한 내용을 읽기
			while(rs.next()) {
				System.out.println(rs.getString(1) + " " + rs.getString(2)
				+ " " + rs.getString(3) + " " + rs.getDouble(4));
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			//6. Close
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
