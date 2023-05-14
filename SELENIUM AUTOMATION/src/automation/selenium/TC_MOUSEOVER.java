package automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TC_MOUSEOVER {
	public static void main(String args[]) throws Exception{
		//Test Steps
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(4000);
		System.out.println("Login completed");
		//mouseover to PIM main menu
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.
		        findElement(By.xpath("//span[text()='PIM']"))).perform();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[text()='Add Employee']")).click();
		Thread.sleep(4000);
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(4000);
		driver.close();
		System.out.println("Application Closed");

		}
		}

