package com.jayanthi.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;

public class GmailSignInPage {
	/*static String s="123";
	@FindBy(id="123")
	public WebElement txtusername;*/
	
	
	//public static void main(String[] args) {
		//WebDriver d=new FirefoxDriver();
		//d.findElement(By.xpath("//input[@id='IdentifierId']")).clear();	
	@FindBy(id="IdentifierId")
	public WebElement txtusername;
	@FindBy(xpath="//span[text()='Next']")
	public WebElement btnnext;
	@FindBy(name="password")
	public WebElement txtPassword;
	
	

}
