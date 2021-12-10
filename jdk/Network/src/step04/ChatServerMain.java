package step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ChatServerMain {
	private static ArrayList<ServerWorker> list = new ArrayList<ServerWorker>();

	public static void main(String[] args) {
		ServerSocket server = null;

		try {
			server = new ServerSocket(1234);

			while (true) {
				Socket client = server.accept();
				System.out.println(client.getInetAddress() + "님이 접속하셨습니다.");
				ServerWorker worker = new ServerWorker(client);
				worker.start();
				list.add(worker);
				System.out.println("현재 접속자 수 : " + list.size());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static class ServerWorker extends Thread {
		private Socket client;
		private BufferedReader br;
		private PrintWriter pw;

		public ServerWorker(Socket client) {
			this.client = client;
			try {
				br = new BufferedReader(new InputStreamReader(client.getInputStream()));
				pw = new PrintWriter(client.getOutputStream());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		// 클라이언트에게 메세지를 보내는 메서드
		public void sendMessage(String msg) {
			pw.println(msg);
			pw.flush();
		}

		@Override
		public void run() {
			try {
				while (true) {
					String msg = br.readLine();
					if(msg == null || msg.equals("exit")) break;
					broadCasting(client.getInetAddress()+"님의 메세지 : "+msg);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}finally {
				try {
					if(client != null)client.close();
					if(br != null)br.close();
					if(pw != null)pw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				list.remove(this);
				System.out.println(client.getInetAddress() + "님이 접속을 종료하셨습니다.");
				System.out.println("현재 접속자 수 : " + list.size());
			}
		}
	}
	
	public static void broadCasting(String msg) {
		for(int i=0;i<list.size();i++)
			list.get(i).sendMessage(msg);
	}
	
}









