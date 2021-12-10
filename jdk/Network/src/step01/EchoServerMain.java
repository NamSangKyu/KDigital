package step01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServerMain {

	public static void main(String[] args) {
		ServerSocket server = null;
		BufferedReader br = null;
		PrintWriter pw = null;
	 	
		try {
			server = new ServerSocket(1234);
			Socket client = server.accept();
			System.out.println(client.getInetAddress()+"님이 접속하셨습니다.");
			br = new BufferedReader(new InputStreamReader(client.getInputStream()));
			pw = new PrintWriter(client.getOutputStream());
			
			while(true) {
				String str = br.readLine();
				if(str == null || str.equals("exit"))
					break;
				//System.out.println(str);
				pw.println("서버 : "+str);
				pw.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(br != null)br.close();
				if(pw != null)pw.close();
				if(server != null)server.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}









