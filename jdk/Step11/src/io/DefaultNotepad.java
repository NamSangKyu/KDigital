package io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class DefaultNotepad {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("파일명 입력 : ");
		String fileName = sc.nextLine();
		//파일 경로 잡기
		File file = new File("c:\\test\\"+fileName);
		
		if(!file.getParentFile().exists()){
			file.getParentFile().mkdirs();
		}
		FileWriter fw = null;
		PrintWriter pw = null;
		try {
			fw = new FileWriter(file, true);
			pw = new PrintWriter(fw);
			
			while(true) {
				System.out.print("내용 입력 > ");
				String str = sc.nextLine();
				if(str.equals("exit")) break;
				pw.println(str);
				pw.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(pw != null)pw.close();
				if(fw != null)fw.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}






