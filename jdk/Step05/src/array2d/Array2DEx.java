package array2d;

public class Array2DEx {
	public static void main(String[] args) {
		//					  행 열
		int[][] arr = new int[4][5];
		
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		System.out.println(arr[1].length);
		System.out.println(arr[2].length);
		System.out.println(arr[3].length);
		int n = 1;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j] = n;
				n++;
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}




