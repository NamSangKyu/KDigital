package list;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListTest {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		
		long startTime = System.nanoTime();
		for(int i=0;i<10000;i++)
			list1.add(i);
		long endTime = System.nanoTime();
		System.out.println(endTime-startTime);
		
		startTime = System.nanoTime();
		for(int i=0;i<10000;i++)
			list2.add(i);
		endTime = System.nanoTime();
		System.out.println(endTime-startTime);
		
		startTime = System.nanoTime();
		for(int i=0;i<10000;i++)
			list1.get(i);
		endTime = System.nanoTime();
		System.out.println(endTime-startTime);

		startTime = System.nanoTime();
		for(int i=0;i<10000;i++)
			list2.get(i);
		endTime = System.nanoTime();
		System.out.println(endTime-startTime);
	}

}



