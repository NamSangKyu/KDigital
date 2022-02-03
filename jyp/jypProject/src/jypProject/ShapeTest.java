package jypProject;

class Point{
	int x;
	int y;
	
	Point(int x, int y){
		this.x = x; 
		this.y = y; 
	}
	
	String getLocation() {
		return "x :" + x + "  y :" + y;
	}
	
}


class Shape{
	String color = "black";
	
	void draw() {
		System.out.println(color);
	}
	
}

class Circle extends Shape{
	Point center;
	int r; // ¹ÝÁö¸§ 
	
	Circle(){
		this(new Point(0,0) , 0);
		
	}
	
	Circle(Point center, int r){
		
		this.center = center;
		this.r = r; 
		
	}
	
	void draw() {
		System.out.println(color);
		System.out.println(center.x);
		System.out.println(center.y);
		System.out.println(r);
	}
}



public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle();
		c.draw();
		
	}

}
