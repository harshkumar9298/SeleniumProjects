package automation.selenium;
//To access object Ind:/Element Locators methods
import org.openqa.selenium.By;
//To access webdriver classes & methods
import org.openqa.selenium.WebDriver;
//To access firefox browser
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC_FIREOX_LOG_IN_LOGOUT_MAIN {
	public static void main (String args[]) throws Exception{
		//to open firefox web browser
		WebDriver driver=new FirefoxDriver();
		System.out.println("Fire fox opened successfully");
		//to open given url website
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		System.out.println("Application opened successfully");
		//for wait
		Thread.sleep(3000);
		//for sending user name
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		System.out.println("user name entered");
		//for sending password
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		System.out.println("password entered");
		//for wait
		Thread.sleep(3000);
		//click on submit button
		driver.findElement(By.name("Submit")).click();
		System.out.println("submit button clicked successfully");
		//for wait
		Thread.sleep(3000);
		//click on logout button
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Logout Button clicked successfully");
		//for wait
		Thread.sleep(3000);
		
		driver.close();
		System.out.println("firefox web browser closed");
		
	}

}
