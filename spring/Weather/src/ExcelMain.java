import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.util.ZipSecureFile;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelMain {

	public static void main(String[] args) {
		ZipSecureFile.setMinInflateRatio(0); //safe guard 해제
		
		try {
			FileInputStream fis = new FileInputStream("position.xlsx");
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			//엑셀 시트 선택
			XSSFSheet sheet = workbook.getSheetAt(0);//엑셀 시트 인덱스 번호
			System.out.println("전체 행 개수 : "+sheet.getPhysicalNumberOfRows());
			System.out.println("해당 라인의 컬럼 수 : "+sheet.getRow(0).getPhysicalNumberOfCells());
			System.out.println("4행 5열에 있는 셀 값 : "+sheet.getRow(3).getCell(4));
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}





