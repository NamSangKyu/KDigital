package io;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

public class DataWriteArray {

	public static void main(String[] args) {
		//바이트 단위로 들어감
		ByteBuffer buffer = ByteBuffer.allocate(8);
		buffer.putInt(0,10); //0번째부터 10을 저장
		buffer.putInt(4, -10);//4번째부터 -10을 저장 
		byte[] n = buffer.array();
		
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream("c:\\test\\array.dat");
			fos.write(n);
			fos.flush();
			System.out.println("파일 쓰기 완료");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fos != null)fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}

}





