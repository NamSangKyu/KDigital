package join;

public class JoinTest {

	public static void main(String[] args) {
		JoinThread j1 = new JoinThread("스레드1");
		JoinThread j2 = new JoinThread("스레드2");
		
		j1.start();
		try {
			j1.join(2000); //2000 실행
		} catch (Exception e) {
			e.printStackTrace();
		}
		j2.start();
		System.out.println("main 종료");
	}

}
