package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import config.DBManager;
import dto.StudentDTO;

public class StudentDAO {
	private static StudentDAO instance = new StudentDAO();
	private Connection conn;
	private StudentDAO() {
		conn = DBManager.getInstance().getConn();
	}

	public static StudentDAO getInstance() {
		if(instance==null)
			instance = new StudentDAO();
		return instance;
	}

	public StudentDTO login(String sno, String name) {
		String sql = "select * from student where student_no like ? and name like ?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		StudentDTO dto = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, sno);
			pstmt.setString(2, name);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				dto = new StudentDTO(rs.getString(1), rs.getString(2), 
						rs.getInt(3), rs.getDouble(4));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null)rs.close();
				if(pstmt != null)pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return dto;
	}
	public ArrayList<StudentDTO> selectAllStudent(){
		ArrayList<StudentDTO> list = new ArrayList<StudentDTO>();
		String sql = "select * from student";
		PreparedStatement pstmt = null;
		ResultSet rs = null;		
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				list.add(new StudentDTO(rs.getString(1), rs.getString(2), 
						rs.getInt(3), rs.getDouble(4)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null)rs.close();
				if(pstmt != null)pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
}















