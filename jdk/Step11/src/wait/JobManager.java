package wait;

public class JobManager {
	public synchronized void writeJobManage(String msg) {
		JobInfo.getInstance().writeJob(msg);
		System.out.println("직업정보를 업데이트 하였습니다.");
		System.out.println("--------------------------------");
	}
}
