package Actions_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dropdown_customize {
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\chrome driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//mandatory otherwise show no such element exception
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		//select month
		WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		//create object of actions class
		Actions act=new Actions(driver);
		//click on month
		act.click(month).perform();
		//move upside by one
		act.sendKeys(Keys.ARROW_UP).perform();
		//move step down
		act.sendKeys(Keys.ARROW_DOWN).perform();
		//click on october
		act.sendKeys(Keys.ENTER).perform();
		
		
		
	}

}
