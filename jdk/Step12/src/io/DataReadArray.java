package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;

public class DataReadArray {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("c:\\test\\array.dat");
			byte[] arr = new byte[4];
			
			while(true) {
				int count = fis.read(arr);
				if(count == -1) break;
				System.out.print(ByteBuffer.wrap(arr).getInt()+" ");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fis != null)fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}





