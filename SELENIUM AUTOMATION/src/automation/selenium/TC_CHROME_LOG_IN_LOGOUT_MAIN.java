package automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_CHROME_LOG_IN_LOGOUT_MAIN {
	public static void main (String args[]) throws Exception{
		//to open firefox web browser
		WebDriver driver=new ChromeDriver();
		System.out.println("Chrome opened successfully");
		//to open given url website
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		System.out.println("Application opened successfully");
		//for wait
		Thread.sleep(4000);
		//for sending user name
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		System.out.println("user name entered");
		//for sending password
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		System.out.println("password entered");
		//for wait
		Thread.sleep(4000);
		//click on submit button
		driver.findElement(By.name("Submit")).click();
		System.out.println("submit button clicked successfully");
		//for wait
		Thread.sleep(4000);
		//click on logout button
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Logout Button clicked successfully");
		//for wait
		Thread.sleep(4000);
		
		driver.close();
		System.out.println("firefox web browser closed");
		
	}

}
