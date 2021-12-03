package interface_ex;

public class PayMain {
	public static void pay(Pay[] arr, int money) {
		for(int i=0;i<arr.length;i++)
			arr[i].pay(money);
	}
	public static void main(String[] args) {
		//Pay 배열 선언, 객체 등록
		Pay[] arr = {
				new Cooker("김철수"),
				new Player("홍길동", 10),
				new Employee("노예", "인턴")				
		};
		//pay 메서드 호출
		pay(arr,2500);
	}

}
