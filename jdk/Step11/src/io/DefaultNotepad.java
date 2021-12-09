package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
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
		
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			String str;
			while((str=br.readLine())!= null) {
				System.out.println(str);
			}
		} catch (FileNotFoundException e1) {
			System.out.println("해당 파일이 없습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fr.close();
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
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






