package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import config.DBManager;

public class MemberDAO {
	private static MemberDAO instance = new MemberDAO();

	private Connection conn;
	
	private MemberDAO() {
		conn = DBManager.getInstance().getConn();
	}

	public static MemberDAO getInstance() {
		if(instance == null)
			instance = new MemberDAO();
		return instance;
	}
	
	public String login(String id, String pass) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select * from member where id like ? and passwd like ?";
		String result = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pass);
			
			rs = pstmt.executeQuery();
			
			if(rs.next())
				result = rs.getString(1);
		
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	
	
	
}







