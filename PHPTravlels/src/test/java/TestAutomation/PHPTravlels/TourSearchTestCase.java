package TestAutomation.PHPTravlels;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.Select;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TourSearchTestCase 
{
	@Test
	public void TourSearch() throws IOException, InterruptedException
	{
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\workspace\\PHPTravlels\\src\\main\\java\\data.properties");
		prop.load(fis);
		
		System.setProperty("webdriver.chrome.driver","C:\\wdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
		driver.get(prop.getProperty("Host"));
		PHPTourSearch pts=new PHPTourSearch(driver);
		pts.Tours().click();
		
		//TourPickLoc
		pts.ToursSearch().click();
		pts.TourSearchKeys().sendKeys(prop.getProperty("TourPickUp"));
		pts.TourSearchKeys().sendKeys(Keys.DOWN);
		Thread.sleep(1000);
		pts.TourSearchKeys().sendKeys(Keys.ENTER);
		//pts.TourLink().click();
		
		//Checkin
		pts.Checkin().click();
		Thread.sleep(1000);
		while(true)
		{
			String str=driver.findElement(By.xpath("//div[11]//div[1]//tr[1]//th[2]")).getText();
			if(str.equalsIgnoreCase(prop.getProperty("Month")))
			{
				break;
			}
			else
			{
				driver.findElement(By.xpath("//div[11]//div[1]//tr[1]//th[3]")).click();
			}
			
			
		}
		driver.findElement(By.xpath("//div[11]//tr//td[contains(text(),"+prop.getProperty("daydate")+")]")).click();
		
		//Guests
		pts.Guests().click();
		
		Select s= new Select(driver.findElement(By.xpath("//select[@id='adults']")));
		s.selectByIndex(3);
		
		//TourType
		pts.TourType().click();
		Select s1= new Select(driver.findElement(By.xpath("//select[@id='tourtype']")));
		s1.selectByIndex(1);
		
		//search
		pts.Searchbtn().click();
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Screenshot\\TourSearchScreenshot.png"));
	}
}
