package anonymous;

public class Player {
	private Item item;

	public Player(Item item) {
		this.item = item;
	}
	
	public void changeItem(Item item) {
		this.item = item;
	}
	
	public void itemExecute() {
		item.execute();
	}
	
}
