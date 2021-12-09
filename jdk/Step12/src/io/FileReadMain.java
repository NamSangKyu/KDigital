package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadMain {

	public static void main(String[] args) {
		File file = new File("c:\\test\\write.txt");
		
		FileReader fr = null;
		BufferedReader br = null;
		try {
			//초기화
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			
			//읽기
			while(true) {
				String str = br.readLine();
				if(str == null) break;
				System.out.println(str);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}







