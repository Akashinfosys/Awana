package FB_login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
	public static void main(String[] args) throws Throwable {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("AkashPagar");
		
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("@Ak123");
		//maximize
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		//close
		driver.manage().window().minimize();
		

		
		
		
	}

}
