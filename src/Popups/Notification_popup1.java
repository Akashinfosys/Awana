package Popups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Notification_popup1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chrome driver\\chromedriver_win32\\chromedriver.exe");
		//create object of browser setting class
		ChromeOptions c=new ChromeOptions();
		c.addArguments("--disable-notifications");
		c.addArguments("start-maximized");
		
		//open the browser
		WebDriver driver=new ChromeDriver(c);//reference variable c is mandatory here
		driver.manage().window().maximize();
		driver.get("https://www.hdfc.com/");
		
	}

}
