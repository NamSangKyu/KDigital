package vo;

public class BookVO {
	
	//필드 
	private String title;
	private String writer;
	private String publisher;
	private boolean loan;
	
	
	//생성자 
	public BookVO(String title, String writer, String publisher) {
		super();
		this.title = title;
		this.writer = writer;
		this.publisher = publisher;
	}


	//메서드 
	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getWriter() {
		return writer;
	}


	public void setWriter(String writer) {
		this.writer = writer;
	}


	public String getPublisher() {
		return publisher;
	}


	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}


	public boolean isLoan() {
		return loan;
	}


	public void setLoan(boolean loan) {
		this.loan = loan;
	}
	
	public void printInfo() {
		System.out.println(title + " " + writer + " " + publisher + " " + (loan ? "대출 중" : "대출 가능"));
	}
	
}
