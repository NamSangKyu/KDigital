package constructor;

public class Person {
	String name;
	int age;
	
	/*
	 * 생성자(Constructor)
	 * 		클래스를 생성할때 제일 먼저 실행되는 메서드
	 * 		생성자는 메서드 명이 클래스 명과 동일
	 * 오버로딩
	 * 		메서드가 이름 동일하더라도 
	 * 		매개변수 형태가 다르면 동일한 이름 쓸수 있음
	 * 		1. 매개변수 개수가 다름
	 * 		2. 매개변수 변수 타입이 다름
	 */
	Person(){
		System.out.println("Person 생성자 호출");
	}
	Person(String n, int a){
		name = n;
		age = a;
	}
	//이름은 외부에서 받고, 나이는 30으로 초기화하는 생성자 작성
	Person(String n){
		age = 30;
		name = n;
	}
}



