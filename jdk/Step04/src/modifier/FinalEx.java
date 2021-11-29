package modifier;

public class FinalEx {

	public static void main(String[] args) {
		final double PI = 3.1415;//상수 선언
		//pi = 111.124; //상수는 저장된 값을 바꿀수 없음
		final int num;
		num = 100;//첫번째 값을 초기화 하는 것까지는 허용
//		num = 100;//두번째 값을 저장하는 것은 허용하지 않음
		Card card = new Card("0000-1111-2222-4444", "홍길동", 22, 9);
		card.printCardInfo();
	}

}
