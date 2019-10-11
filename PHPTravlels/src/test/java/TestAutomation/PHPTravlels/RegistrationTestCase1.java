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

public class RegistrationTestCase1 
{
	@Test
	public void RegistrationTestCases1() throws IOException
	{
		Properties prop=new Properties();
		FileInputStream fis = new FileInputStream("C:\\workspace\\PHPTravlels\\src\\main\\java\\data.properties");
		
		prop.load(fis);
		
		System.setProperty("webdriver.chrome.driver","C:\\wdrivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(prop.getProperty("Host"));
		
		PhpRegistrationPage1 Reg= new PhpRegistrationPage1(driver);
		Reg.MyAccount().click();
		Reg.signUp().click();
		Reg.Firstname().sendKeys(prop.getProperty("Firstname"));
		Reg.Lastname().sendKeys(prop.getProperty("Lastname"));
		Reg.Mobileno().sendKeys(prop.getProperty("Mobileno"));
		Reg.email().sendKeys(prop.getProperty("email"));
		Reg.Password().sendKeys(prop.getProperty("Password"));
		Reg.ConfirmPassword().sendKeys(prop.getProperty("ConfirmPassword"));
		Reg.Cookie().click();
		Reg.submit().click();
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Screenshot\\RegistrationSearchScreenshot.png"));
	}
}
