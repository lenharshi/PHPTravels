package TestAutomation.PHPTravlels;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
import org.testng.annotations.Test;


public class HotelSearchTestCase
{
	
	@Test
	public void HotelSearch() throws IOException, InterruptedException
	{
		
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\workspace\\PHPTravlels\\src\\main\\java\\data.properties");
		prop.load(fis);
		
		System.setProperty("webdriver.chrome.driver","C:\\wdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
		driver.get(prop.getProperty("Host"));
		PHPHotelSearch phs= new PHPHotelSearch(driver);
		phs.HotelSearch().click();
		phs.PickUp().click();
		phs.PickUpKeys().sendKeys(prop.getProperty("PickUpKeys"));
		phs.PickUpKeys().sendKeys(Keys.DOWN);
		Thread.sleep(1000);
		phs.PickUpKeys().sendKeys(Keys.ENTER);
		
		//phs.PickUpSelect().click();
		phs.Checkin().click();
		Thread.sleep(1000);
		
		//checkin
		while(true)
		{
			String str=driver.findElement(By.xpath("//div[14]//div[1]//tr[1]//th[2]")).getText();
			if(str.equalsIgnoreCase(prop.getProperty("Month")))
			{
				break;
			}
			else
			{
				driver.findElement(By.xpath("//div[14]//div[1]//tr[1]//th[3]")).click();
			}
		}
		/*//while(!driver.findElement(By.xpath("//div[14]//div[1]//tr[1]//th[2]")).getText().contains("Month"))
		{
			driver.findElement(By.xpath("//div[14]//div[1]//tr[1]//th[3]")).click();
			break;
		}*/
		/*int count=driver.findElements(By.className("day")).size();
		for(int i=0;i<count;i++)
		{
			String text=driver.findElements(By.className("day")).get(i).getText();
			if(text.equalsIgnoreCase("daydate"))
			{
				driver.findElements(By.className("day")).get(i).click();
				
			}
		}
		*/
		driver.findElement(By.xpath("//div[14]//tr//td[contains(text(),"+prop.getProperty("daydate")+")]")).click();
		//checkout
		while(true)
		{
			String str=driver.findElement(By.xpath("//div[15]//div[1]//tr[1]//th[2]")).getText();
			if(str.equalsIgnoreCase(prop.getProperty("Month")))
			{
				break;
			}
			else
			{
				driver.findElement(By.xpath("//div[15]//div[1]//tr[1]//th[3]")).click();
			}
		}
		driver.findElement(By.xpath("//div[15]//tr//td[contains(text(),"+prop.getProperty("daydate2")+")]")).click();
		driver.manage().window().maximize();
		
		phs.guest().click();
		phs.Adults().click();
		phs.child().click();
		phs.searchbtn().click();
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Screenshot\\HotelSearchScreenshot.png"));
		
		
	}
}

