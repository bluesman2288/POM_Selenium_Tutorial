package homepage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	By username = By.id("username");
	By password = By.id("password");
	By loginButton = By.id("login");
	
	WebDriver driver;
	
	public void invokeBrowser() {
		System.setProperty("webdriver.chrome.driver", "/Users/ekwong/Downloads/chromedriver");
		driver = new ChromeDriver();
		
		driver.get("http://www.adactin.com/HotelApp/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30,  TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30,  TimeUnit.SECONDS);
	}
	
	public void enterLoginInfo() {
		driver.findElement(username).sendKeys("sdurral123");
		driver.findElement(password).sendKeys("Test123");
		driver.findElement(loginButton).click();
		
	}
}
