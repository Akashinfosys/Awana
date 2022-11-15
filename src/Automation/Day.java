package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day {
	public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\chrome driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		//select date to check dropdown
		Thread.sleep(4000);
		//referance variable for day dropdown
		WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
		//create object of select class
		Select s=new Select(day);
		
		s.selectByVisibleText("26");
		//s.selectByValue("26");
	
		
		
	}

}
