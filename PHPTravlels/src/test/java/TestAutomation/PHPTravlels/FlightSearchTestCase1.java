package TestAutomation.PHPTravlels;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FlightSearchTestCase1 
{
	@Test
	public void login() throws IOException, InterruptedException
	{
	Properties prop=new Properties();
	FileInputStream fis = new FileInputStream("C:\\workspace\\PHPTravlels\\src\\main\\java\\data.properties");
	prop.load(fis);
	

	System.setProperty("webdriver.chrome.driver","C:\\wdrivers\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get(prop.getProperty("Host"));
	
	PhpFlightSearch1 Fls= new PhpFlightSearch1(driver);
	Fls.cookie().click();
	Fls.Flight().click();
	Fls.PickupLocation().click();
	Fls.PickupLocation1().sendKeys(prop.getProperty("PickupLocation1"));
	Fls.PickupLocation1().sendKeys(Keys.DOWN);
	Thread.sleep(1000);
	Fls.PickupLocation1().sendKeys(Keys.ENTER);
	
	//DropLocation
	Fls.DropLocation().click();
	Fls.DropLocation1().sendKeys(prop.getProperty("DropLocation"));
	Fls.DropLocation1().sendKeys(Keys.DOWN);
	Thread.sleep(1000);
	Fls.DropLocation1().sendKeys(Keys.ENTER);
	
	//checkin
	Fls.Checkin().click();
	Thread.sleep(1000);
	while(true)
	{
		String str=driver.findElement(By.xpath("//div[16]//div[1]//tr[1]//th[2]")).getText();
		if(str.equalsIgnoreCase(prop.getProperty("Month")))
		{
			break;
		}
		else
		{
			driver.findElement(By.xpath("//div[16]//div[1]//tr[1]//th[3]")).click();
		}
		
		
	}
	driver.findElement(By.xpath("//div[16]//tr//td[contains(text(),"+prop.getProperty("daydate")+")]")).click();
	
	//Guests
	driver.manage().window().maximize();
	Fls.Guests().click();
	Thread.sleep(1000);
	
	Fls.Adults().click();
	Select s=new Select(driver.findElement(By.xpath("//select[@id='madult']")));
	s.selectByIndex(0);
	
	Fls.Children().click();
	Select s1=new Select(driver.findElement(By.xpath("//select[@id='mchildren']")));
	s1.selectByIndex(1);
	
	Fls.Infant().click();
	Select s2=new Select(driver.findElement(By.xpath("//select[@id='minfant']")));
	Thread.sleep(1000);
	s2.selectByIndex(2);
	driver.findElement(By.xpath("//button[@id='sumManualPassenger']")).click();
	
	Fls.Searchbtn().click();
	
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src, new File("C:\\Screenshot\\FlightSearchScreenshot.png"));
	
	}
}
