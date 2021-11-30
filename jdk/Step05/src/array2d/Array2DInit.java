package array2d;

public class Array2DInit {

	public static void main(String[] args) {
		int[][] arr1 = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12}				
		};
		//arr1 출력
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				System.out.print(arr1[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println();
		int[][] arr2 = new int[][] {
			{1,2,3,4},
			{5,6},
			{7,8,9}
		};
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2[i].length;j++) {
				System.out.print(arr2[i][j]+"\t");
			}
			System.out.println();
		}
	}

}




