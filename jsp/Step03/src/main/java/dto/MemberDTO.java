package dto;

public class MemberDTO {
	private String id;
	private String name;
	private String passwd;
	private int age;
	public MemberDTO() {
	}
	public MemberDTO(String id, String name, String passwd, int age) {
		super();
		this.id = id;
		this.name = name;
		this.passwd = passwd;
		this.age = age;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}



