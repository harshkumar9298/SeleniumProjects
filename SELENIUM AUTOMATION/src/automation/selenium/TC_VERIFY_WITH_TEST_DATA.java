package automation.selenium;
//To access webdriver classes & methods
import org.openqa.selenium.WebDriver;
//To access firefox browser
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//To access object Ind:/Element  methods
import org.openqa.selenium.By;

public class TC_VERIFY_WITH_TEST_DATA {
			//TestData
			        // DT    Var          VarValue
			static String url      = "http://183.82.103.245/nareshit/login.php";
			static String title1   = "OrangeHRM - New Level of HR Management";
			static String username = "nareshit";
			static String password = "nareshit";
			static String title2   = "OrangeHRM";
public static void main(String args[]) throws Exception{
			    //Test Steps
			WebDriver driver = new ChromeDriver(); // Launch Browser
			driver.navigate().to(url);//enter url
			Thread.sleep(3000);
			System.out.println("Application Opened");
			//Verify Title
			//Actual Result     compare ExpectedResult
			if(driver.getTitle().equals(title1)) {
				System.out.println("Title matched");    
			}
			else {
				System.out.println("Title not matched");
				System.out.println(driver.getTitle());
				}
				driver.findElement(By.name("txtUserName")).sendKeys(username);
				driver.findElement(By.name("txtPassword")).sendKeys(password);
				Thread.sleep(3000);
				driver.findElement(By.name("Submit")).click();
				Thread.sleep(3000);
				System.out.println("Login completed");
				//Verify Title
				//Actual Result   compare   ExpectedResult
				if(driver.getTitle().equals(title2)) {
					System.out.println("Title matched");    
				}
				else {
					System.out.println("Title not matched");    
				}
				driver.findElement(By.linkText("Logout")).click();
				Thread.sleep(3000);
				System.out.println("Logout completed");
	            driver.close(); //to close browser/application


}
}