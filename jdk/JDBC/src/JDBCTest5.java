import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest5 {

	public static void main(String[] args) {
		/*
		 * DBManager를 이용해서 학생테이블의 정보 조회
		 * 학과별 평점 평균을 조회 ---> 학과명 평점평균
		 */
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		//접속 정보 받음
		try {
			conn = DBManager.getInstance().getConn();
			stmt = conn.createStatement();
			String sql = "select m.major_name, avg(s.score) from student s, major m"
					+ " where s.major_no = m.major_no "
					+ "group by m.major_name";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				System.out.println(rs.getString(1) + " " + rs.getDouble(2));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

}





