package POM_with_pagefactory_using_testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
@FindBy(xpath = "//td[@class='pagetitle']")private WebElement text;
	
	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public String verifytext(String expText) {
		
		String actText=text.getText();
		return actText;
}
}
