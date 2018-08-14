package homepage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;;

public class AssignmentLogin {
	By username = By.name("userName");
	By password = By.name("password");
	By loginButton = By.name("login");
	By signoff = By.linkText("SIGN-OFF");
	
	WebDriver driver;
	
	public void invokeBrowser() {
		System.setProperty("webdriver.gecko.driver", "/Users/ekwong/Downloads/geckodriver");
		driver = new FirefoxDriver();
		
		driver.get("http://newtours.demoaut.com/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30,  TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30,  TimeUnit.SECONDS);
	}
	
	public void enterLoginInfo() {
		driver.findElement(username).sendKeys("tutorial");
		driver.findElement(password).sendKeys("tutorial");
		driver.findElement(loginButton).click();
	}
	
	public void signoff() {
		driver.findElement(signoff).click();
	}
}
