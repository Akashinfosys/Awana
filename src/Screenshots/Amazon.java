package Screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Amazon {
	public static void main(String[] args) throws Throwable {
System.setProperty("webdriver.chrome.driver", "C:\\chrome driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		//how to take screenshot
		TakesScreenshot ts=(TakesScreenshot)driver;//typecasting
		//use getscreenshot method and store in src
		File src=ts.getScreenshotAs(OutputType.FILE);
		//
		File dest=new File("C:\\Users\\ADMIN\\Desktop\\Screenshot\\amazon.jpg");
		//
		Files.copy(src, dest);
	}

}
