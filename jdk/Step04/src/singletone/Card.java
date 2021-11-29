package singletone;

public class Card {
	private static int cardSequence = 1000;

	// 카드번호 - int
	private int cardNo;
	// 소유주 - String
	private String name;

	// 생성자 - 소유주
	public Card(String name) {
		super();
		this.name = name;
	}
	// printCardInfo
	public void printCardInfo() {
		System.out.println(cardNo + " " + name);
	}

	// set/get
	public int getCardNo() {
		return cardNo;
	}

	public void setCardNo(int cardNo) {
		this.cardNo = cardNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	
}
