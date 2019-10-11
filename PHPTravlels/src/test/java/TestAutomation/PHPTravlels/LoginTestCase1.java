package TestAutomation.PHPTravlels;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTestCase1 {
	
	@Test
	public void login() throws IOException
	{
	Properties prop=new Properties();
	FileInputStream fis = new FileInputStream("C:\\workspace\\PHPTravlels\\src\\main\\java\\data.properties");
	prop.load(fis);
	

	System.setProperty("webdriver.chrome.driver","C:\\wdrivers\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get(prop.getProperty("Host"));
	PhpLogin1 log1= new PhpLogin1(driver);
	log1.MyAccount().click();
	log1.Login().click();
	log1.Email().sendKeys(prop.getProperty("email"));
	log1.Password().sendKeys(prop.getProperty("Password"));
	log1.Loginbtn().click();
	
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src, new File("C:\\Screenshot\\LoginSearchScreenshot.png"));
	
	}
}
