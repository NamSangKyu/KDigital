package syncronized;

public class SyncroMain {

	public static void main(String[] args) {
		Bank bank = new Bank();
		Player p1 = new Player(bank);
		Player p2 = new Player(bank);
		Player p3 = new Player(bank);
		Player p4 = new Player(bank);
		
		p1.start();
		p2.start();
		p3.start();
		p4.start();
	}

}
