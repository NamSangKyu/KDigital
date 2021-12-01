package array2d;

import java.util.Arrays;

public class Array2DQuest03 {

	public static void main(String[] args) {
		int ea = 5, n = 1 , sw = 1, row=0, col=-1;
		int[][] arr = new int[5][5];
		
		while(true) {
			for(int i=0;i<ea;i++) {
				col += sw;
				arr[row][col] = n++;
			}
			ea--;
			if(ea == 0) break;
			
			for(int i=0;i<ea;i++) {
				row += sw;
				arr[row][col] = n++;
			}
			sw = -sw;
		}
		
		for(int i=0;i<arr.length;i++) System.out.println(Arrays.toString(arr[i]));
	}

}
