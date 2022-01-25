package dto;
public class BoardDTO {
	private int bno;
	private String title;
	private String content;
	private String writer;
	private String bdate;
	private int bcount;
	private int blike;
	private int bhate;
	
	public BoardDTO(int bno, String title, String content, String writer, String bdate, int bcount, int blike,
			int bhate) {
		super();
		this.bno = bno;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.bdate = bdate;
		this.bcount = bcount;
		this.blike = blike;
		this.bhate = bhate;
	}

	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getBdate() {
		return bdate;
	}

	public void setBdate(String bdate) {
		this.bdate = bdate;
	}

	public int getBcount() {
		return bcount;
	}

	public void setBcount(int bcount) {
		this.bcount = bcount;
	}

	public int getBlike() {
		return blike;
	}

	public void setBlike(int blike) {
		this.blike = blike;
	}

	public int getBhate() {
		return bhate;
	}

	public void setBhate(int bhate) {
		this.bhate = bhate;
	}

	@Override
	public String toString() {
		return "BoardDTO [bno=" + bno + ", title=" + title + ", content=" + content + ", writer=" + writer + ", bdate="
				+ bdate + ", bcount=" + bcount + ", blike=" + blike + ", bhate=" + bhate + "]";
	}
	
	
	
}
