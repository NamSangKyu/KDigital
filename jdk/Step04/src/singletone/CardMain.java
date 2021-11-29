package singletone;

public class CardMain {

	public static void main(String[] args) {
		Card card1 =  CardFactory.getInstance().createCard("홍길동");
		Card card2 =  CardFactory.getInstance().createCard("김철수");
		Card card3 =  CardFactory.getInstance().createCard("박영수");
		Card card4 =  CardFactory.getInstance().createCard("이영희");
		
		card1.printCardInfo();
		card2.printCardInfo();
		card3.printCardInfo();
		card4.printCardInfo();
	}

}
