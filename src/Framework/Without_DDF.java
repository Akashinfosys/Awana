package Framework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Without_DDF {
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\chrome driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//delete all coockies
		
		driver.manage().deleteAllCookies();
		
		//maximize
		
		driver.manage().window().maximize();
		
		//open the application
		
		driver.get("https://demo.actitime.com/login.do");
		
		//enter username
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		
		//enter password
		
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		
		//click on enter button
		
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		//add something on homepage
		
		driver.findElement(By.xpath("//input[@class='taskSearchField']")).sendKeys("AKASH");
		
		//get actual title
		
		String actT = driver.getTitle();
		System.out.println(actT);
		
		//expected title
		
		String expT = "actiTIME - Enter Time-Track";
		
		//compare both
		
		if(actT.equals(expT)) {
			
			System.out.println("TC is pass");
			
		}
		else {
			System.out.println("TC is fail");
		}
		
		
				
		
		
		
	
	}

}
