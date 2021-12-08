package join;

public class JoinThread extends Thread{

	public JoinThread(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		try {
			for(int i=1;i<=1000;i++) {
				System.out.println(getName() + " - " +i);
				Thread.sleep(10);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
