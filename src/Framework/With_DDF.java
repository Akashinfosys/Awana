package Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class With_DDF {
	public static void main(String[] args) throws Throwable {
		
		//fetch data from excel
		FileInputStream fis=new FileInputStream("C:\\Users\\ADMIN\\Documents\\Book2.xlsx");
		
		Sheet sh = WorkbookFactory.create(fis).getSheet("Sheet1");
		
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
		String UN = sh.getRow(0).getCell(0).getStringCellValue();
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(UN);
		
		//enter password
		String pass = sh.getRow(0).getCell(1).getStringCellValue();
		
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(pass);
		
		//enter on login button
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		//enter something on homepage
		String data = sh.getRow(0).getCell(2).getStringCellValue();
		
		driver.findElement(By.xpath("//input[@id='taskSearchControl_field']")).sendKeys(data);
		
		//verify title of page
		
		String exp = sh.getRow(0).getCell(3).getStringCellValue();
		
		String act = driver.getTitle();
		//compare
		if(exp.equals(act)) {
			System.out.println("TC is pass");
		}
		else {
			System.out.println("TC is fail");
		}
		
		
		
		
		
	}

}
