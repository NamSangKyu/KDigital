import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest3 {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe",
					"scott", "tiger");
			conn.setAutoCommit(false);		
			stmt = conn.createStatement();
			
			String sql = "insert into student values('20219988', '홍길동',3,3.15)";
			
			int count = stmt.executeUpdate(sql);
			
			System.out.println(count + "건 추가 되었습니다.");
			conn.commit();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
