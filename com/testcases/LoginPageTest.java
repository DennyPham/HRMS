package com.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.hrms.pages.LoginPage;
import com.hrms.utils.CommonMethods;


public class LoginPageTest extends CommonMethods{
@Test
public void login() {
	LoginPage login= new LoginPage();
	sendText(login.username, "Admin");
	sendText(login.password, "Hum@nhrm123");
	click(login.loginBtn);
}

/*
 * Navigate to HRMS
 * Enter UID
 * Leave password fields blank
 * click login
 * verify "Password cannot be empty" text
 * close browser
 */

@Test
public void login1() throws InterruptedException {
	LoginPage login1=new LoginPage();
	sendText(login1.username,"Admin");
	click(login1.loginBtn);
	String expected="Password cannot be empty";
	WebElement error=driver.findElement(By.id("spanMessage"));
	waitForVisibility(error);
	Assert.assertEquals(login1.Error, expected);
	
	
	
}







}
