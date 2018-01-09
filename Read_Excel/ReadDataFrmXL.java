package Read_Excel;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.junit.Test;

public class ReadDataFrmXL {
	
	//@Test
	public static String[][] readData(String filePath, int SheetNum) throws Exception{
		
		
		System.out.println("Inside read from data");
		//String filePath = "C:\\test\\testData.xls";
		File file = new File(filePath);
		
		FileInputStream fIP = new FileInputStream(file);
		
		HSSFWorkbook wb = new HSSFWorkbook(fIP);
		HSSFSheet sheet = wb.getSheetAt(SheetNum);
		
		 int xRows = sheet.getLastRowNum() + 1;
		 System.out.println("Rows are  : " + xRows);
		 
		  int xCols = sheet.getRow(0).getLastCellNum();
		 
		  System.out.println("Cols are : " + xCols);
		  
		  String[][] xData = new String[xRows][xCols];
		  
		  for(int i = 0; i<xRows; i++){
			  HSSFRow row = sheet.getRow(i);
			  
			  for(int j = 0; j<xCols; j++){
				  
				  HSSFCell cell = row.getCell(j);
				  
				  String value = cellToString(cell);
				  
				   xData[i][j]= value;
				   
				   System.out.print(value); 
	                System.out.print("##");
			  }
			  System.out.println("@");
		  }
		  
		  wb.close();
		return xData;
	}

	public static String cellToString(HSSFCell cell) {
		int type = cell.getCellType();
		Object result = null;
		
		switch(type){
		
		case HSSFCell.CELL_TYPE_BLANK:
			result = "";
			break;
			
		case HSSFCell.CELL_TYPE_BOOLEAN:
			result = cell.getBooleanCellValue();
			break;
			
		case HSSFCell.CELL_TYPE_ERROR:
			throw new RuntimeException("There is some error.");
		
		case HSSFCell.CELL_TYPE_FORMULA:
			throw new RuntimeException("There is formula.");
			
		case HSSFCell.CELL_TYPE_NUMERIC:
			result = cell.getNumericCellValue();
			break;
			
		case HSSFCell.CELL_TYPE_STRING:
			result = cell.getStringCellValue();
			break;
			
		default:
			throw new RuntimeException("Out of world.");
		}
		
		return result.toString();
	}
}
