package com.hrms.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GENERAL extends GLOBAL {
	//To provide all re-usable fun: of whole application
	public void openApplication() {
	 driver = new FirefoxDriver();
	driver.navigate().to(url);
	System.out.println("Application opened");
	}
	public void closeApplication() {
	driver.close();
	System.out.println("Application closed");
	}
	public void login() {
	driver.findElement(By.name(txt_loginname)).sendKeys(un);
	driver.findElement(By.name(txt_password)).sendKeys(pw);
	driver.findElement(By.name(btn_login)).click();
	System.out.println("Login completed");
	}
	public void logout() {
	driver.findElement(By.linkText(link_logout)).click();
	System.out.println("Logout completed");
	}

}
