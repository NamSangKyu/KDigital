package test;

class Product {
	int price;			// ��ǰ�� ����
	int bonusPoint;		// ��ǰ���� �� �����ϴ� ���ʽ�����
	String name;
	
	Product(int price, String n) {
		this.price = price;
		this.name = n;
		
		bonusPoint =(int)(price/10.0);	// ���ʽ������� ��ǰ������ 10%
	}
}

class Tv extends Product {
	
	Tv(String n) {
		super(100 , n);
	
	}

	public String toString() {	// ObjectŬ������ toString()�� �������̵��Ѵ�.
		return "Tv";
	}
}

class Computer extends Product {
	
	Computer(String n) {
		super(200 , n);
	
	}

	public String toString() {
		return "Computer";
	}
}

// ��ǰŬ���� �߰� 
class Phone extends Product {
	
	Phone(String n) {
		super(150 , n);
	
	}

	public String toString() {
		return "Phone";
	}
}

class Buyer {			// ��, ������ ��� ���
	int money = 1000;	// �����ݾ�
	int bonusPoint = 0;	// ���ʽ�����
	
	Product[] item = new Product[10];
	
	int i =0;
	
	void buy(Product p) { 
		item[i++] = p;      
	}
	
	void cancel(Product p) { 
//		System.out.println(p.price);
		
		for(int i = 0;i <item.length ; i++) {
			if(item[i] == null ) {
				break;
			}
			
			if(item[i].name == p.name ) {
				System.out.println("�迭"+item[i].name);
				System.out.println("�迭"+item[i].price);
				
				System.out.println(p.name);
				System.out.println(p.price);
			}
		}  
	}
	
	void summary() {
		int sum = 0;
		for(int i = 0;i <item.length ; i++) {
			if(item[i] == null ) {
				break;
			}
			sum += item[i].price;
			//System.out.println(item[i].price);
		}
		
		//System.out.println(sum);
	}
	

}

public class PolyArgumentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buyer a = new Buyer();
		
		Phone phone1 = new Phone("phone1");
		a.buy(phone1);
		
		Phone phone2 = new Phone("phone2");
		a.buy(phone2);
		
		Computer Computer1 = new Computer("Computer1");
		a.buy(Computer1);
	
		
		a.cancel(Computer1);
		
		a.summary();
//		System.out.println("a ���� ���� ���� " + a.money + "�����Դϴ�.");
		
		
		
		
		
		
	}

}
