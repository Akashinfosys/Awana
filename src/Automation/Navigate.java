package Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
	public static void main(String[] args) throws Throwable{
System.setProperty("webdriver.chrome.driver", "C:\\chrome driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		Thread.sleep(3000);
		
		driver.get("https://www.amazon.com");
		Thread.sleep(3000);
		
		driver.navigate().back();//now page will navigate from amazon to back to google
		Thread.sleep(2000);
		
		driver.navigate().forward();//now page will navigate from google to amazon
		
		driver.navigate().refresh();//whenever webpage refresh in automation address of webpage can be change
		
		
	}

}
