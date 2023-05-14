package automation.selenium;
//To access webdriver classes & methods
import org.openqa.selenium.WebDriver;
//To access chrome browser
import org.openqa.selenium.chrome.ChromeDriver;
//To access object Ind:/Element Locators methods
import org.openqa.selenium.By;

public class TC_CHROME_LOGIN_LOGOUT {
	public static void main(String args[]) throws Exception {
		//to open chrome browser
		WebDriver driver=new ChromeDriver();
		System.out.println("chrome browser opened successfully");
		//to open given url application
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		System.out.println("Application opened successfully");
		//to wait application for 3000 m/s
		Thread.sleep(3000);
		//to close the driver
		driver.close();
		
	}
}
