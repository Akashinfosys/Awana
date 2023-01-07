package POM_with_pagefactory_using_testng;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

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
	     
	     driver.get("https://demo.actitime.com/login.do");
	     
	     lp=new Loginpage(driver);
	     
	     hp=new Homepage(driver);
	}
	
	@BeforeMethod
	
	public void openApp() {
		//enter UN 
		
		String username=sh.getRow(0).getCell(0).getStringCellValue();
		
		lp.enterUN(username);
		
		//enter PWD
		
		String password=sh.getRow(0).getCell(1).getStringCellValue();
		
		lp.enterPWD(password);
		
		//click loginBtn
		
		lp.clickloginBTN();
		
	}
	@org.testng.annotations.Test
	
	public void verifyText() {
		Reporter.log("running verify text",true);
		
		String expText=sh.getRow(0).getCell(2).getStringCellValue();
		
		String actText=hp.verifytext(expText);
		Assert.assertEquals(expText, actText,"Failed both are different");
		
	}
	/*@AfterMethod
	public void closeApp() {
		Reporter.log("logout from app",true);

	}
	@AfterClass
	public void closeBrowser() {
	Reporter.log("close the browser",true);	
	}*/
}
