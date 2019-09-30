package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.company.pages.HomePage;
import com.company.pages.LoginPage;
import com.company.pages.ZohoAppPage;

public class LoginTest {
	
	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\com\\company\\executables\\chromedriver.exe");
	
	  WebDriver driver= new ChromeDriver();
		driver.get("https://www.zoho.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		HomePage home= new HomePage();
		LoginPage lp= home.goToLogin();
		
		
		
		
	}
		
	

}
