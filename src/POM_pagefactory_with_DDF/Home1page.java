package POM_pagefactory_with_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home1page {
	@FindBy(xpath = "//td[@class='pagetitle']")private WebElement text;
	
	public Home1page(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void verifytext(String expText) {
		
		String actText=text.getText();
		
		if(actText.equals(expText)) {
			System.out.println("TC is pass");
		}
		else {
			System.out.println("TC is fail");
		}
	}

}
