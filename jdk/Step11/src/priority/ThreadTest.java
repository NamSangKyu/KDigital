package priority;

public class ThreadTest {

	public static void main(String[] args) {
		ThreadPriority t1 = new ThreadPriority("스레드1");
		ThreadPriority t2 = new ThreadPriority("스레드2");
		ThreadPriority t3 = new ThreadPriority("스레드3");
		ThreadPriority t4 = new ThreadPriority("스레드4");
		ThreadPriority t5 = new ThreadPriority("스레드5");
		ThreadPriority t6 = new ThreadPriority("스레드6");
		
		t1.setPriority(Thread.MAX_PRIORITY);//1~10 우선순위 값 10으로 갈수록 높음
		t2.setPriority(Thread.MIN_PRIORITY);
		t3.setPriority(Thread.MIN_PRIORITY);
		t4.setPriority(Thread.MIN_PRIORITY);
		t5.setPriority(Thread.MIN_PRIORITY);
		t6.setPriority(Thread.MIN_PRIORITY);
		
		t1.start();t2.start();t3.start();t4.start();t5.start();t6.start();
		System.out.println("main 종료");
	}

}




