package string;

public class StringTest {

	public static void main(String[] args) {
		String str1 = "Hello World Java Android";
		
		//0번 인덱스에 해당하는 글자 뽑기
		System.out.println(str1.charAt(0));
		//기존 문자열 뒤에 문자열 붙임
		System.out.println(str1.concat("TEST"));
		//World 위치 찾기 --> 인덱스 값 리턴, 없으면 -1
		System.out.println(str1.indexOf("World"));
		//o를 찾을때 10번 인덱스 부터 찾겠다.
		System.out.println(str1.indexOf("o", 10));
		//문자열 길이
		System.out.println(str1.length());
		//맨끝에서부터 검색 --> 인덱스 값 리턴, 없으면 -1
		System.out.println(str1.lastIndexOf("Java"));
		//문자열 바꾸기, World를 Hell로 바꿈
		System.out.println(str1.replace("World", "Hell"));
		//str1을 " "로 자르기, 자른 단어들을 배열로 관리
		String[] arr = str1.split(" ");
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}

}







