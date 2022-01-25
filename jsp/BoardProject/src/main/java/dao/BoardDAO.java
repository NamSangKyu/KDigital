package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import config.DBManager;
import dto.BoardDTO;

public class BoardDAO {
	private static BoardDAO instance = new BoardDAO();

	private Connection conn;
	
	private BoardDAO() {
		conn = DBManager.getInstance().getConn();
	}

	public static BoardDAO getInstance() {
		if(instance == null)
			instance = new BoardDAO();
		return instance;
	}

	public ArrayList<BoardDTO> selectPageBoard(int pageNo) {
		ArrayList<BoardDTO> list = new ArrayList<BoardDTO>();
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select * from (select ceil(rownum / 7) as pageno, b.* from "
				+ "(select * from board_list order by bno desc) b) where pageno = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, pageNo);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				list.add(new BoardDTO(rs.getInt(2), rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getString(6), rs.getInt(7),
						rs.getInt(8), rs.getInt(9)));
			}
			
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
		
		return list;
	}
	
	
	
	
	
}







