package modifier;

public class Card {
	//카드번호
	private final String cardNo;
	//소유자 이름
	private final String name;
	//유효기간 - 년도
	private final int year;
	//유효기간 - 월
	private final int month;
	//상수가 필드로 선언되어 있으면 반드시 생성자를 이용하여 초기화 해야됨
	public Card(String cardNo, String name, int year, int month) {
		super();
		this.cardNo = cardNo;
		this.name = name;
		this.year = year;
		this.month = month;
	}
	
	public void printCardInfo() {
		System.out.println(cardNo + " "+name +" "+month+"/"+year);
	}
}










