package com.web.dto;

public class StudentDTO {
	private String sno;
	private String name;
	private int majorNo;
	private double score;
	public StudentDTO() {	}
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMajorNo() {
		return majorNo;
	}
	public void setMajorNo(int majorNo) {
		this.majorNo = majorNo;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	
	
}
