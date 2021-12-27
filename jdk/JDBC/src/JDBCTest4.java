import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest4 {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe",
					"scott", "tiger");
			conn.setAutoCommit(false);		
			stmt = conn.createStatement();
			
			String sql = "delete from student where score < 1.0";
			
			int count = stmt.executeUpdate(sql);
			
			System.out.println(count + "건 삭제 되었습니다.");
			conn.rollback();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
