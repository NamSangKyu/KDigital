package inheritance;

public class NoWindAirCon extends AirCon{

	@Override
	public void changeMode() {
		mode = mode % 4 + 1;
		
		switch (mode) {
		case 1:	
			System.out.println("냉방");
			break;
		case 2:	
			System.out.println("송풍");
			break;
		case 3:	
			System.out.println("무풍 냉방");
			break;
		case 4:	
			System.out.println("컨트롤 냉방");
			break;
		}
	
	}
	
}
