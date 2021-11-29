package singletone;

public class NumberMain {

	public static void main(String[] args) {
		Number num = Number.getInstance();
		System.out.println(num.getNum());
		num.addNum();
		System.out.println(num.getNum());
		
		Number.getInstance().addNum();
		
		Number n1 = Number.getInstance();
		Number n2 = Number.getInstance();
		System.out.println(n1.getNum());
		System.out.println(n2.getNum());
		
		System.out.println(num);
		System.out.println(n1);
		System.out.println(n2);
	}

}






