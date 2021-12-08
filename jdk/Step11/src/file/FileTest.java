package file;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) {
		File file = null;
		file = new File("c:\\test\\test.txt");
		
		System.out.println(file.getParent());
		//부모 폴더 경로
		File parentFile = file.getParentFile();
		//현재 파일 경로
		System.out.println(parentFile.getAbsolutePath());
		//파일 생성전에는 파일이 위치한 폴더 경로가 있는지 체크
		if(!parentFile.exists()) {
			//경로가 없을때
			//해당 경로까지의 모든 폴더를 생성
			parentFile.mkdirs();
			System.out.println("해당 경로 폴더 생성 완료");
		}
		
		try {
				
			boolean result = file.createNewFile();//파일 생성
			System.out.println(result);
			file.delete();//파일 삭제
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}









