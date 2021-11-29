package string;

public class StringEquals {
	public static void main(String[] args) {
		String str1 = "홍길동";
		String str2 = new String("홍길동");
		String str3 = str1;
		
		System.out.println(str1);
		System.out.println(str2);
		
		//메모리 주소 비교 - 내용 비교 X
		System.out.println(str1 == str2);//메모리 주소로 비교하기 때문에 내용이 같아도 false
		System.out.println(str1 == str3);
		
		//문자열 내용 비교
		System.out.println(str1.equals(str2));
		System.out.println(str3.equals(str2));
	}
}
