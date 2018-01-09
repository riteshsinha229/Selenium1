package XL_Read_Multiple;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {
	
	public ReadData() throws Exception{
		
		super();
	}

	int rows_total;
	DataFieldValues dataSheet = null;
	List<DataFieldValues> dataSheetList = new ArrayList<DataFieldValues>();
	Row row = null;
	XSSFCell cell = null;
	
	public List<DataFieldValues> readDatafromExcel(String filepath, String sheetName) throws Exception{
		
		FileInputStream inputStream = new FileInputStream(filepath);
		XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
		XSSFSheet sheet = workbook.getSheet(sheetName);
		
		rows_total = sheet.getLastRowNum();
		System.out.println("Total no of rows:"+rows_total);
		
		for(int i=1; i<=rows_total; i++) {
			
			 row = sheet.getRow(i);
			 dataSheet = new DataFieldValues();
			 System.out.println("Row No : "+row);
			 
			 
			 cell = (XSSFCell) row.getCell(0);			 
			 System.out.println("Cell : "+cell);
			 dataSheet.setUserName(cell.getStringCellValue());
			 
			 
			 
			 cell = (XSSFCell) row.getCell(1);
			 System.out.println("Cell 1: "+cell);
			 dataSheet.setPassword(cell.getStringCellValue());
			 
			 
			 dataSheetList.add(dataSheet);
			  
		}
		
			return dataSheetList;
		
	}
}
