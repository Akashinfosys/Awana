package Popups;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_browser_popup {
	public static <E> void main(String[] args) throws Throwable {
System.setProperty("webdriver.chrome.driver", "C:\\chrome driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		//open the application
		driver.get("https://www.flipkart.com/");
		//click on close button
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		//search for mobiles
	    driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("mobiles under 20000",Keys.ENTER);
	   
	    //click on mobile
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//div[text()='vivo T1 5G (Rainbow Fantasy, 128 GB)']")).click();
	    
	    //by default seleniun ids controll on main window we have to take all windows
	    Thread.sleep(5000);
	    Set<String> allwindows = driver.getWindowHandles();
	    
	    //using array list we can store all windows sequentially
	    Thread.sleep(5000);
	    ArrayList<String>al=new ArrayList<String>(allwindows);
	    //i want to print address of main window
	    String mainwin = al.get(0);
	    Thread.sleep(5000);
	    System.out.println(mainwin);
	    
	    //i want to print session id of child window
	    String childwin = al.get(1);
	    Thread.sleep(5000);
	    System.out.println(childwin);
	    
	     }

}
