package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientMain {

	public static void main(String[] args) {
		Socket server = null;
		BufferedReader br = null;
		PrintWriter pw = null;
		
		try {
			//서버 접속
			server = new Socket("127.0.0.1",1234);
			//스트림 초기화
			br = new BufferedReader(new InputStreamReader(server.getInputStream()));
			pw = new PrintWriter(server.getOutputStream());
			//데이터 전송 및 받기
			pw.println("Hello");
			pw.flush();
			String str = br.readLine();
			System.out.println(str);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			//close
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







