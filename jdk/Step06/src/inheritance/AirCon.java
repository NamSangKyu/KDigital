package inheritance;

public class AirCon {
	protected int temp;
	protected int mode;
	protected int wind;
	
	public void tempUp() {
		if(temp < 32)
			temp++;
		System.out.println("현재 온도 : "+temp);
	}
	public void tempDown() {
		if(temp > 18)
			temp--;
		System.out.println("현재 온도 : "+temp);
	}
	public void changeMode() {
		mode = mode % 3 + 1;
		switch(mode) {
		case 1: 
			System.out.println("냉방 모드");
			break;
		case 2:
			System.out.println("송풍 모드");
			break;
		case 3:
			System.out.println("난방 모드");
			break;			
		}
	}
	public void windPower() {
		wind = wind % 4 + 1;
		System.out.println("현재 바람세기 : "+wind);
	}
	
}






