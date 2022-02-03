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

class Point3D extends Point{
	int z;
	
	Point3D(int x, int y, int z){
//		this.x = x;
//		this.y = y;
		super(x, y);
		this.z = z;
	}
	
	String getLocation() {
		return "x :" + x + "  y :" + y + "  z:" + z; 
	}
}


public class PointTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point point3d = new Point3D(1, 2, 3);
//		부모클래스 타입의 참조변수로 // 자식 클래스 타입의 인스턴스를 참조한다. 
		
		Point3D point3d = new Point(1, 2);
		
		
		System.out.println(point3d.getLocation());
	}

}
