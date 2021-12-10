package step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ChatClientMain {

	public static void main(String[] args) {
		Socket server = null;
		PrintWriter pw = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			server = new Socket("192.168.1.58", 1234);
			pw = new PrintWriter(server.getOutputStream());
			
			Worker worker = new Worker(server);
			worker.start();
			
			while(true) {
				System.out.println("메세지 입력>>>");
				String str = sc.nextLine();
				pw.println(str);
				pw.flush();
				if(str.equals("exit")) break;
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(pw != null)pw.close();
				if(server != null)server.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
	private static class Worker extends Thread {
		private Socket client;
		private BufferedReader br;
		public Worker(Socket client) {
			this.client = client;
			try {
				br = new BufferedReader(new InputStreamReader(client.getInputStream()));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		@Override
		public void run() {
			try {
				while (true) {
					String msg = br.readLine();
					if (msg == null || msg.equals("exit")) break;
					System.out.println(msg);
				}
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					if(br != null) br.close();
					if(client != null) client.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
