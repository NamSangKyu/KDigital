package step01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class EchoClientMain {

	public static void main(String[] args) {
		Socket server = null;
		BufferedReader br = null;
		PrintWriter pw = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			server = new Socket("127.0.0.1",1234);
			br = new BufferedReader(new InputStreamReader(server.getInputStream()));
			pw = new PrintWriter(server.getOutputStream());
			while(true) {
				System.out.print("메세지 입력>");
				String str = sc.nextLine();
				pw.println(str);
				pw.flush();
				if(str.equals("exit"))
					break;
				str = br.readLine();
				System.out.println(str);
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(br!=null)br.close();
				if(pw!=null)pw.close();
				if(server!=null)server.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}













