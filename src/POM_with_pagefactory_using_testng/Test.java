package POM_with_pagefactory_using_testng;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class Test {
	//Globally declare some values
	Sheet sh;
	WebDriver driver;
	Loginpage lp;
	Homepage hp;
	
	@BeforeClass
	public void openBrowser() throws Throwable {
		FileInputStream fis=new FileInputStream("C:\\Users\\ADMIN\\Documents\\Fetch data for pom.xlsx");
		sh=WorkbookFactory.create(fis).getSheet("Sheet1");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
	     driver=new ChromeDriver();
	     
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
		
}
