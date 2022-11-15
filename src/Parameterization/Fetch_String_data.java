package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetch_String_data {
	public static void main(String[] args) throws Throwable {
		//create object of FileInputStream class
		
	FileInputStream fis=new FileInputStream("C:\\Users\\ADMIN\\Documents\\Book1.xlsx");
	
	//use create method to open excel sheet
	
	String value=WorkbookFactory.create(fis).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	
	System.out.println(value);
	}

}
