package week6.day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	public static void main(String[] args) throws IOException{
	
		XSSFWorkbook wb=new XSSFWorkbook("./Excelfolder/Loginpage.xlsx");
		XSSFSheet sheet=wb.getSheetAt(0);
		//XSSFSheet sh=wb.getSheet("Loginpage");
		XSSFRow row=sheet.getRow(0);
		int lastRowNum = sheet.getLastRowNum();
		System.out.println("no of rows :"+lastRowNum);
		short lastCellNum = row.getLastCellNum();
		System.out.println("no of cells :"+lastCellNum);
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		System.out.println("with header rows :"+physicalNumberOfRows );
		
		for (int i = 1; i <=lastRowNum; i++) {
			XSSFRow row2 =sheet.getRow(i);
			for (int j = 1; j<lastCellNum ; j++) {
				String CellValue = row2.getCell(i).getStringCellValue();
				System.out.println(CellValue);
				
			}
			
		}
		wb.close();

	}

}
