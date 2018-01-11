package com.jayanthi.fw;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

public class GmailComposePage {
public void sendkeys(String ObjName,String data)
{
WebElement element=null;;
try{
if(element.isDisplayed())
{
element.clear();
element.sendKeys(data);
Reporter.log("Data entered on "+ObjName+"data as "+data);
}

}catch (NoSuchElementException e) {
throw e;
}
}

}
