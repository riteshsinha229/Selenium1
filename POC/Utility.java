package POC;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Utility {


	String desktopPath = (System.getProperty("user.home") + "\\Desktop");
	String BasePath=desktopPath+"\\Automation POC";
	String DatablePath=BasePath+"\\Data Table";	
	
	
	
	
	
/*
	String ScName=UtEnv.getScenarioName();
	String desktopPath = (System.getProperty("user.home") + "\\Desktop");
	String BasePath=desktopPath+"\\E2E_Vision_Auto";
	String DatablePath=BasePath+"\\Data Table";

	String Ctime=xlreadint(1,4);
	String ImgPath=BasePath + "\\Images\\Img_"+ Ctime+"\\"+ ScName ;
	String LogPath=BasePath + "\\Logs\\Log_"+ Ctime;
	String ModulePath=BasePath+"\\Modules";

*/


	//int StepNo=0;

	//********************************************************************************************************************
	/*Get current row no*/
	public int  getRowCount(){

		int i=10;
		try {
			Workbook w = WorkbookFactory.create(new FileInputStream(DatablePath+"\\BBJ BatchRunner.xls") );
			//Workbook w = WorkbookFactory.create(new FileInputStream("C:\\Users\\607518700\\Desktop\\E2E_Vision_Auto\\Data Table\\BBJ BatchRunner.xls") );
			Sheet sh = w.getSheet("Test Data");
			for(;i<100;i++){ 

				if (sh.getRow(i).getCell(0).getStringCellValue().equals("Yes")){

					break;
				}
			}
		} 
		catch (Exception e) {
			//exceptionTrace(e);
		}
		//System.out.println("row No==>"+i);
		return i;
	}

	
	
	public void WriteToExcel(String blnResult) throws IOException, InterruptedException {
		
		System.out.println("excel write path-->"+BasePath+"\\Utilities\\excelWrite.exe");
		String[] dialog =  new String[]{BasePath+"\\Utilities\\excelWrite.exe","Status",blnResult,String.valueOf(UtEnv.rowNum+1)};
		Process p = Runtime.getRuntime().exec(dialog);
		System.out.println("Waiting for writing Status in excel ...");
		p.waitFor();
		System.out.println("Auto It excel write script completed for Status");		
		
	}	
	
	
	
	//*****************************************************************************************************************	
	/*read from excel(Using Column name)*/
	public String xlRead(String colName){ 
		String value="";
		try{			
			int rownum=UtEnv.rowNum;// getRowCount();
			
			//int rownum = getRowCount();		
			
			Workbook workbook = WorkbookFactory.create(new FileInputStream(DatablePath+"\\BBJ BatchRunner.xls"));
			//Workbook workbook = WorkbookFactory.create(new FileInputStream("C:\\Users\\607518700\\Desktop\\E2E_Vision_Auto\\Data Table\\BBJ BatchRunner.xls"));
			Sheet sheet = workbook.getSheet("Test Data");

			for(int cols=0;cols<100;cols++){

				
				String Field = sheet.getRow(9).getCell(cols).getStringCellValue();


				if(Field.equals(colName)){

					Cell cell= sheet.getRow(rownum).getCell(cols);

					if( cell.getCellType()==Cell.CELL_TYPE_NUMERIC){
						value= String.valueOf(cell.getNumericCellValue());
					}
					else if( cell.getCellType()==Cell.CELL_TYPE_STRING ){

						value= cell.getStringCellValue();
						//System.out.println(value);

					}
					else if( cell.getCellType()==Cell.CELL_TYPE_FORMULA ){
						value= cell.getStringCellValue();
					}
					else {

					}
					break;
				}


			} 
		}catch(Exception e){
			//exceptionTrace(e);
		}
		return value; 
	}
	//*****************************************************************************************************************
}