package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetch_Numeric_Data {
	public static void main(String[] args) throws Throwable {
		//create object of fileinputstream class
		
		FileInputStream fis=new FileInputStream("C:\\Users\\ADMIN\\Documents\\Book1.xlsx");
		
		//use create method to open excel sheet
		 
		double value=WorkbookFactory.create(fis).getSheet("Sheet1").getRow(0).getCell(1).getNumericCellValue();
		
		System.out.println(value);
	}

}
