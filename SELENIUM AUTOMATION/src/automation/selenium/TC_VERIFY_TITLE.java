package automation.selenium;
//To access webdriver classes & methods
import org.openqa.selenium.WebDriver;
//To access firefox browser
import org.openqa.selenium.firefox.FirefoxDriver;

//To access object Ind:/Element  methods
import org.openqa.selenium.By;

public class TC_VERIFY_TITLE {
public static void main(String args[]) throws Exception{
    //Test Steps
WebDriver driver = new FirefoxDriver(); // Launch Browser
driver.navigate().to("http://183.82.103.245/nareshit/login.php");//enter url
Thread.sleep(3000);
System.out.println("Application Opened");
//Verify Title
//Actual Result     compare ExpectedResult
if(driver.getTitle().equals("OrangeHRM - New Level of HR Management")) {
System.out.println("Title matched");    
}
else {
System.out.println("Title not matched");
System.out.println(driver.getTitle());
}
driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
Thread.sleep(3000);
driver.findElement(By.name("Submit")).click();
Thread.sleep(3000);
System.out.println("Login completed");
//Verify Title
//Actual Result   compare   ExpectedResult
if(driver.getTitle().equals("OrangeHRM")) {
System.out.println("Title matched");    
}
else {
System.out.println("Title not matched");    
}
driver.findElement(By.linkText("Logout")).click();
Thread.sleep(3000);
System.out.println("Logout completed");
driver.close(); //to close browser/application
System.out.println("Application Closed");

}
}