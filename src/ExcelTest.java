
import  java.io.*;  
import  org.apache.poi.hssf.usermodel.HSSFSheet;  
import  org.apache.poi.hssf.usermodel.HSSFWorkbook;  
import  org.apache.poi.hssf.usermodel.HSSFRow;  

public class ExcelTest {

	public static void main(String[] args) 
    {
      
		try   
		{  
		//declare file name to be create   
		//String filename = ("user.dir")+"//CustomerData//Balance.xlsx";  
		//C:\Users\palsh\eclipse-workspace\TEST_SEL\CustomerData
		String filename = "C:\\Users\\palsh\\eclipse-workspace\\TEST_SEL\\CustomerData\\Data.xls";  
		//creating an instance of HSSFWorkbook class  
		HSSFWorkbook workbook = new HSSFWorkbook();  
		//invoking creatSheet() method and passing the name of the sheet to be created   
		HSSFSheet sheet = workbook.createSheet("Account_Data");   
		//creating the 0th row using the createRow() method  
		HSSFRow rowhead = sheet.createRow((short)0);  
		//creating cell by using the createCell() method and setting the values to the cell by using the setCellValue() method  
		rowhead.createCell(0).setCellValue("AccountNumber");  
		rowhead.createCell(1).setCellValue("PIN");  
		
		//creating the 1st row  
		HSSFRow row = sheet.createRow((short)1);  
		//inserting data in the first row  
		row.createCell(0).setCellValue("059D07213");  
		row.createCell(1).setCellValue("7255");  
		
		
		
		FileOutputStream fileOut = new FileOutputStream(filename);  
		workbook.write(fileOut);  
		//closing the Stream  
		fileOut.close();  
		//closing the workbook  
		workbook.close();  
		//prints the message on the console  
		System.out.println("Excel file has been generated successfully.");  
		}   
		catch (Exception e)   
		{  
		e.printStackTrace();  
		}  
		
    }
}
