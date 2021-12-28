package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import config.DBManager;
import oracle.jdbc.driver.DBConversion;
import vo.StudentVO;

public class StudentDAO {
	private static StudentDAO instance = new StudentDAO();

	private StudentDAO() {	}

	public static StudentDAO getInstance() {
		if(instance == null)
			instance = new StudentDAO();
		return instance;
	}

	public StudentVO selectStudent(String studentNo) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		StudentVO vo = null;
		try {
			String sql = "select * from student where student_no like ?";
			pstmt = DBManager.getInstance().getConn().prepareStatement(sql);
			//sql문에 ? 부분에 데이터 셋팅
			pstmt.setString(1, studentNo);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				vo = new StudentVO(rs.getString(1),
						rs.getString(2), rs.getInt(3), rs.getDouble(4));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return vo;
	}

	public ArrayList<StudentVO> selectAllStudent() {
		ArrayList<StudentVO> list = new ArrayList<StudentVO>();
		PreparedStatement pstmt = null;
		String sql = "select * from student";
		ResultSet rs = null;
		try {
			pstmt = DBManager.getInstance().getConn().prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				list.add(new StudentVO(rs.getString(1), rs.getString(2), 
						rs.getInt(3), rs.getDouble(4)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	
}








