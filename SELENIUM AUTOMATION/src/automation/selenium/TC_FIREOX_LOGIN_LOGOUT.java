package automation.selenium;
//To access webdriver classes & methods
import org.openqa.selenium.WebDriver;
//To access firefox browser
import org.openqa.selenium.firefox.FirefoxDriver;
//To access object Ind:/Element Locators methods
import org.openqa.selenium.By;

public class TC_FIREOX_LOGIN_LOGOUT {
	public static void main(String args[]) throws Exception {
		//to open firefox web browser
		WebDriver driver= new FirefoxDriver();
		System.out.println("fire fox opened");
		//to open given url website
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		System.out.println("application opened");
		//for wait
		Thread.sleep(3000);
		//for closing web driver
		driver.close();
		System.out.println("application Closed");
	}
}
