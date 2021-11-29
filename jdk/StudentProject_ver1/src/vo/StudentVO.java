package vo;
/*
 * 학생 클래스
 * 	학번, 이름, 학과, 평점을 가지고 있음
 *  학생 정보를 출력하는 메서드
 *  생성자로 모든 필드를 초기화, set/get method 작성
 */
public class StudentVO {
	private String studentNo;
	private String name;
	private String major;
	private double score;

	public StudentVO(String studentNo, String name, String major, double score) {
		this.studentNo = studentNo;
		this.name = name;
		this.major = major;
		this.score = score;
	}

	public String getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}
	
	public void printStudentInfo() {
		System.out.println(studentNo + "\t" + name + "\t" + major + "\t" + score);
	}
	
}







