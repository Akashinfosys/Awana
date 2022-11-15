package Upstox_Framework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Without_DDF_Upstox {
	public static void main(String[] args) {
		//set properties
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//delete all cookies
		driver.manage().deleteAllCookies();
		//maximize the browser
		driver.manage().window().maximize();
		//open the application
		driver.get("https://login-v2.upstox.com/");
		//enter un
		driver.findElement(By.xpath("//input[@id='userCode']")).sendKeys("2QALQX");
		//enter pwd
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Pnishi@321");
		//click on login
		driver.findElement(By.xpath("//div[@class='_2Q-Qvmryo8OlgCHHPQqsDB undefined']")).click();
	}

}
