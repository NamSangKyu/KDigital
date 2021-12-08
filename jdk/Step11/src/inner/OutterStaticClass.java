package inner;

public class OutterStaticClass {
	private int inNum;
	private static double pi = 3.1415;
	
	public OutterStaticClass() {
		inNum = 10;
	}
	
	public static class InStaticClass{
		public void printInNum() {
			//None Static 필드 접근 불가
//			System.out.println(inNum);
			//static 필드는 접근이 가능함
			System.out.println(pi);
		}
	}
}
