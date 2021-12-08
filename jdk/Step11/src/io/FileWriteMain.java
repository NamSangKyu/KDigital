package io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriteMain {

	public static void main(String[] args) {
		//c:\\test\\write.txt --> 생성
		File file = new File("c:\\test\\write.txt");
		if(!file.getParentFile().exists()) {
			file.getParentFile().mkdirs();
		}
		
		FileWriter fw = null;
		PrintWriter pw = null;
		
		try {
			//파일 출력 스트림 생성 및 파일 연결
			fw = new FileWriter(file,true);
			//프로세스 스트림 생성
			pw = new PrintWriter(fw);
			
			pw.println("Hello World");
			pw.println("안녕하세요");
			pw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			pw.close();
		}
	}

}









