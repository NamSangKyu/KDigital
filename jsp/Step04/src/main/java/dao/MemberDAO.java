package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import config.DBManager;
import dto.MemberDTO;

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
	
	public ArrayList<MemberDTO> selectMember(){
		ArrayList<MemberDTO> list = new ArrayList<MemberDTO>();
		String sql = "select * from member ";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				list.add(new MemberDTO(rs.getString(1), rs.getString(3),
						rs.getString(2), rs.getInt(4)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
}





