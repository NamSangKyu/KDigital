package list;

import java.util.ArrayList;

public class ArrayListTest {
	/*
	 * 리스트 
	 * 		1. 중복된 데이터가 저장
	 * 		2. 데이터를 저장한 순서가 보장
	 */
	public static void main(String[] args) {
		// <> <-- 제네릭 : 원하는 변수 타입(참조형)
		ArrayList<String> list = new ArrayList<String>();
		
		//데이터 추가
		list.add("JAVA");
		list.add("HTML/CSS");
		list.add("js/jQuery");
		list.add("jsp");
		list.add("Spring");
		list.add("Android");
		list.add(3, "jUnit");//해당 인덱스 위치에 끼워넣기
		
		System.out.println(list.toString());
		
		//데이터 삭제
		list.remove(0);
		System.out.println(list.toString());
		list.remove("jUnit");
		System.out.println(list.toString());
		
		//데이터 교체 - 인덱스 번호, 교체값
		list.set(0, "웹표준");
		System.out.println(list.toString());
		
		//데이터 검색
		System.out.println(list.contains("Spring"));
		System.out.println(list.contains("Spring!"));
		
		//해당 데이터 인덱스 번호
		System.out.println(list.indexOf("Android"));
		
		//현재 저장하고 있는 데이터 개수
		System.out.println("데이터 개수 : "+list.size());
		
		//전체 삭제
//		list.clear();
		System.out.println(list.toString());
		
		//리스트가 비었냐?
		System.out.println(list.isEmpty());
		
		//데이터 조회 - 인덱스 번호로 데이터 조회
		System.out.println(list.get(0));
		
		//데이터 전체 조회 - 인덱스, for, size
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}

}











