package POM_with_pagefactory_without_DDF;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.actitime.com/login.do");
		
		//Object 1st
		LoginPage L=new LoginPage(driver);
		L.enterUN();
		L.enterPWD();
		L.clickloginBTN();
		
		//Object 2nd
		HomePage H=new HomePage(driver);
		H.verifytext();
		
	}

}
 