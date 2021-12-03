package wrapper;

public class WrapperClass {
	/*
	 * 	Wrapper Class
	 * 		기본형 변수를 참조형으로 바꾼 타입
	 * 		문자열 데이터를 해당 타입으로 변경 "1000" ----> 1000 형식으로 변환 가능
	 * 								  "3.1415" --> 3.1415
	 * 		해당 변수 타입에 필요한 기능 및 상수들을 탑재
	 * 기본형	  ==>	참조형
	 * 	byte		Byte
	 * 	int 		Integer
	 *  short		Short
	 *  long		Long
	 *  float		Float
	 *  double 		Double
	 *  char		Character
	 *  boolean		Boolean
	 * 
	 */
	public static void main(String[] args) {
		Integer i1 = 300;
		System.out.println(i1 * 2); //숫자로도 계산
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.BYTES);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		String str1 = "400";
		System.out.println(Integer.parseInt(str1)*2);
		String str2 = "3.1415";
		System.out.println(Double.parseDouble(str2)*2);
		
		int i2 = i1; //auto unboxing
		i1 = i2; //auto boxing
	}

}







