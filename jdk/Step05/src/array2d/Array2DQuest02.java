package array2d;

public class Array2DQuest02 {
	/*
	 * 2차원 정수형 배열 5행 5열짜리 생성
	 * 
	 * 1	2	3	4	5
	 * 10	9	8	7	6
	 * 11	12	13	14	15
	 * 20	19	18	17	16
	 * 21	22	23	24	25
	 * 
	 * 반복문 이용해서 저장 한 후 출력
	 */
	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		int n = 1, j=0;
		int sw = 1;//1 , -1 변경
		
		for(int i=0;i<arr.length;i++) {
			
			while(j > -1 && j < arr[i].length) {
				arr[i][j] = n++;
				j += sw;
			}
			sw = -sw;
			j+=sw;// -1이나 5이기 때문 사전에 한번더 감소나 증가
		}
		for(int i=0;i<5;i++) {
			for(j=0;j<arr[i].length;j++)
				System.out.print(arr[i][j] + "\t");
			System.out.println();
		}
		
	}

}











