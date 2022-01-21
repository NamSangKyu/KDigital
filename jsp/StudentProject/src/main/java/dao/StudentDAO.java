package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

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
	public ArrayList<HashMap<String, Object>> selectAllMajor(){
		String sql = "select * from major order by major_no asc";
		ArrayList<HashMap<String, Object>> list = new ArrayList<HashMap<String,Object>>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				HashMap<String, Object> map = new HashMap<String, Object>();
				map.put("major_no", rs.getInt(1));
				map.put("major_name", rs.getString(2));
				list.add(map);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}

	public int insertStudent(StudentDTO studentDTO) {
		PreparedStatement pstmt = null;
		String sql = "insert into student values(?,?,?,?)";
		int count = 0;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, studentDTO.getSno());
			pstmt.setString(2, studentDTO.getName());
			pstmt.setInt(3, studentDTO.getMajor());
			pstmt.setDouble(4, studentDTO.getScore());
			count = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return count;
	}

	public int deleteStudent(String sno) {
		PreparedStatement pstmt = null;
		String sql = "delete from student where student_no like ?";
		int count = 0;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, sno);
			count = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return count;
	}

	public StudentDTO selectStudent(String sno) {
		String sql = "select * from student where student_no like ?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		StudentDTO dto = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, sno);
			
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
}















