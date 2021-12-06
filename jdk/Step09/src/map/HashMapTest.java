package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapTest {
	/*
	 *	Map
	 *		키값을 이용해서 데이터를 읽어오거나 저장
	 *		키값은 중복 X 
	 */
	public static void main(String[] args) {
		//		키       값
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		//데이터 추가
		//		키값	    데이터
		map.put("Java", 1000);
		map.put("Database", 2200);
		map.put("js/jQuery", 3330);
		map.put("Java", 3000);
		map.put("Jsp", 4004);
		map.put("Android", 5000);
		
		System.out.println(map);
		
		//데이터 읽기
		System.out.println(map.get("Java"));
		System.out.println(map.get("Jsp"));
		System.out.println(map.get("Android"));
		
		//데이터 개수
		System.out.println(map.size());
		
		//contains - key
		System.out.println(map.containsKey("Java"));
		//contains - value
		System.out.println(map.containsValue(3000));
		
		//map.clear();
		System.out.println(map.isEmpty());
		
		//데이터 삭제 - 키값으로 삭제
		map.remove("Jsp");
		
		//keySet ---> 맵에 있는 키값을 set 객체로 리턴
		Set<String> key = map.keySet();
		System.out.println(key);
		
		//키값을 모를때 맵이 가지고 있는 모든 값을 출력
		Iterator<String> it = key.iterator();
		while(it.hasNext()) {
			String k = it.next();
			System.out.println(k + " - " + map.get(k));
		}
	}

}








