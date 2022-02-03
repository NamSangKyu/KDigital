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
			//해당 시트 전체 데이터 조회
			for(int i=0;i<sheet.getPhysicalNumberOfRows();i++) {
				for(int j=0;j<sheet.getRow(0).getPhysicalNumberOfCells();j++) {
					System.out.print(sheet.getRow(i).getCell(j) + "\t");
				}
				System.out.println();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}





