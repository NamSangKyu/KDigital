package list;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		
		//데이터 추가 5가지
		list.add("JAVA");
		list.add("HTML5/CSS");
		list.add("javascript");
		list.add("jsp");
		list.add("Spring");
		
		//전체 조회 
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}

}




