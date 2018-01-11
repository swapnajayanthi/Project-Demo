package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.jayanthi.fw.GmailSignInPage;

public class GmailSignIntest {
@Test

public void test() throws InterruptedException
{

WebDriver d = new FirefoxDriver();
d.get("https://www.gmail.com");
Thread.sleep(4000);

GmailSignInPage page = PageFactory.initElements(d, GmailSignInPage.class);

System.out.println(page.txtusername.isDisplayed());

page.txtusername.sendKeys("jayanthiashamolla@gmail.com");
Thread.sleep(2000);
page.btnnext.click();
Thread.sleep(2000);

page.txtPassword.sendKeys("12345");
Thread.sleep(2000);

page.btnnext.click();
Thread.sleep(2000);






}
	
	
	
}
