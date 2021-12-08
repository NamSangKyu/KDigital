package anonymous;

public class PlayerMain {

	public static void main(String[] args) {
		Knife knife = new Knife();
		Phone phone = new Phone();
		Oven oven = new Oven();

		Player player = new Player(oven);
		player.itemExecute();
		player.changeItem(phone);
		player.itemExecute();
		player.changeItem(knife);
		player.itemExecute();
		
		Item earPhone = new Item() {
			@Override
			public void execute() {
				System.out.println("이어폰으로 음악을 듣습니다.");
			}
		};
		player.changeItem(earPhone);
		player.itemExecute();
		
		player.changeItem(new Item() {
			@Override
			public void execute() {
				System.out.println("리모컨으로 TV를 켭니다.");
			}
		});
		player.itemExecute();
	}

}







