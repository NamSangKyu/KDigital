package model;

class Car {
	String color;
	int door;
	
	void drive() {}
	void stop() {}
	
}

class FireCar extends Car {
	void water() {}
}

class FireCar2 extends Car {
	void water() {}
}

class FireCar3 extends Car {
	void water() {}
}

public class DevcationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = null;
		FireCar f2 = null; 
		FireCar f1 = new FireCar();
		FireCar2 f3 = null;
		
		//�θ� = �ڽ� 
		c1 = f1;  // ���ɽ��� ����o
//		firecar = car; 
		
		c1.drive();
//		c1.water();
		
		f2 = (FireCar)c1; //�ٿ��ɽ��� ����x
		
		f2.water();
		f2.drive();
		f2.stop();
		
		if(f2 instanceof FireCar) {
			
		}else if(f3 instanceof FireCar2) {
			
		}
		
		if(f2 instanceof Object) {
			
		}
		
		if(f2 instanceof Car) {
			
		}

	}

}







