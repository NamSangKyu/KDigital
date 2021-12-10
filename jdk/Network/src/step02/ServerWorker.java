package step02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ServerWorker extends Thread {
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

	@Override
	public void run() {
		try {
			while (true) {
				String msg = br.readLine();
				if(msg == null || msg.equals("exit")) break;
				pw.println(msg);
				pw.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(br != null) br.close();
				if(pw != null) pw.close();
				if(client != null) client.close();
				MultiEchoServerMain.list.remove(this);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}




