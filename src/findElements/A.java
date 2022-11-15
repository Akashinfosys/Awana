package findElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\chrome driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		int count=0;
		driver.get("https://www.flipkart.com/");
		
	List<WebElement> allele=driver.findElements(By.xpath("//div"));
	
	   // we need to use for loop for accessing each element
	
	for(WebElement i:allele) {
		
		String text=i.getText();
		
		System.out.println(text);
		count++;
		}
	    System.out.println(count);//use it to show number of elements got printed
	}

}
