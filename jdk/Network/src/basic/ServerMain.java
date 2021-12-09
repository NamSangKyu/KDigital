package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain {

	public static void main(String[] args) {
		ServerSocket server = null;
		BufferedReader br = null;
		PrintWriter pw = null;
		try {
			//서버 오픈 - port
			server = new ServerSocket(1234);
			//클라이언트 접속
			Socket client = server.accept();
			//스트림 초기화
			br = new BufferedReader(new InputStreamReader(client.getInputStream()));
			pw = new PrintWriter(client.getOutputStream());
			//데이터 전송 및 받기
			String str = br.readLine();
			pw.println("서버가 보낸 메세지 : " + str);
			pw.flush();
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




