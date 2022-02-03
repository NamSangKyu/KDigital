package jypProject;


class Car {
	String color; 
	String type; 
	int door;
	
	Car(){
		
	}
	
	Car(String c){
		this(c,"red", 2);
	}
	
	Car(String color, String type, int door){
		this.color = color; 
		this.type = type;
		this.door = door; 
	}
	
	Car(Car c){
		color = c.color; 
		type = c.type;
		door = c.door ; 
	}
	
}


public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car();
		
		car1.color ="red";
		car1.type = "SUV";
		car1.door = 5;
		
		System.out.println("c1 color :"+car1.color +" c1 color :"+car1.type +" car1.door :"+car1.door );
		
		Car car2 = new Car(car1);
		
//		
//		car2.color ="red";
//		car2.type = "SUV";
//		car2.door = 4;
		
		System.out.println("c2 color :"+car2.color +" c2 type :"+car2.type +" car2.door :"+car2.door );
	}

}
















