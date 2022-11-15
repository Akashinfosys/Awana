package POM_pagefactory_with_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login1page {
	
	@FindBy(xpath = "//input[@id='username']")private WebElement UN;
	@FindBy(xpath = "//input[@name='pwd']")private WebElement PWD;
	@FindBy(xpath = "//div[text()='Login ']")private WebElement loginBTN;
	
	
	//initialization
	
	public Login1page(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	public void enterUN(String username) {
		UN.sendKeys(username);
	}
	public void enterPWD(String password) {
		PWD.sendKeys(password);
	}
	public void clickloginBTN() {
		loginBTN.click();
	}

}
