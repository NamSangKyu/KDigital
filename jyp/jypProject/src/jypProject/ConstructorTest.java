package jypProject;


class Data1{
	int value;// 인스턴스 변수 
}

class Data2{
	int value;// 인스턴스 변수 
	
	Data2(int x){
		value = x;
	}
	
	void dataPrint() {
		System.out.println(value);
	}
}

public class ConstructorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data1 d1 = new Data1();
		d1.value = 1;
		
		System.out.println(d1.value);
		
		Data1 d2 = new Data1();
//		d2.value
//		System.out.println(d1.value);
		
		Data1 d3 = new Data1();
		System.out.println(d1.value);
		
		Data2 d2 = new Data2(1);
		d2.dataPrint();
		
	}

}
