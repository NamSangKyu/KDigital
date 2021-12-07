package init;

public class RunnableTest {

	public static void main(String[] args) {
		RunnableRun run1 = new RunnableRun();
		RunnableRun run2 = new RunnableRun();
		RunnableRun run3 = new RunnableRun();
		RunnableRun run4 = new RunnableRun();
		
		Thread t1 = new Thread(run1, "스레드1");
		Thread t2 = new Thread(run2, "스레드2");
		Thread t3 = new Thread(run3, "스레드3");
		Thread t4 = new Thread(run4, "스레드4");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		System.out.println("main 종료");
	}

}



