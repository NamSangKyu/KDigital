
public class IfEx3 {
	/*
	 * 		XY
	 * 	+	YX
	 * -----------
	 * 		99
	 * 되는 조합을 전부 출력
	 * X와 Y가 가질수 있는 값의 범위는 0~9
	 */
	public static void main(String[] args) {
		for(int X=0;X<10;X++) {
			for(int Y=0;Y<10;Y++) {
				if(X+Y == 9) {
					System.out.println(X + " , " + Y);
					break;
				}
			}
		}
	}

}
