package IFRAMES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\chrome driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
		
		//maximize
		driver.manage().window().maximize();
		//switch to first frame
		driver.switchTo().frame("packageListFrame");
		//take any one element on first frame and print it
		String text1=driver.findElement(By.xpath("//a[text()='org.openqa.selenium.cli']")).getText();
		System.out.println(text1);
		
		//switch from first frame to main webpage
		driver.switchTo().defaultContent();
		
		//switch to 2nd frame
		driver.switchTo().frame("packageFrame");
		//take any one element on 2nd frame and print it
		String text2=driver.findElement(By.xpath("//a[text()='AbstractAnnotations']")).getText();
		System.out.println(text2);
		
		//switch from 2nd frame to main webpage
		driver.switchTo().defaultContent();
		
		//switch to 3rd frame
		driver.switchTo().frame("classFrame");
		//take any one element on 3rd frame and print it
		String text3=driver.findElement(By.xpath("//span[text()='Interface Summary']")).getText();
		System.out.println(text3);
		
		
		
		
		
		
		
	}
	

}
