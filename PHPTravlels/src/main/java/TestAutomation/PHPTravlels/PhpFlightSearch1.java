package TestAutomation.PHPTravlels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PhpFlightSearch1 
{
	    WebDriver driver;
	    
		public PhpFlightSearch1(WebDriver driver) 
		{
			this.driver = driver;
		}
		By cookie= By.xpath("//button[@id='cookyGotItBtn']");
		By Flight= By.xpath("//div[@id='body-section']//li[2]//a[1]");
		By PickupLocation=By.xpath("//div[@id='s2id_origin']//a[@class='select2-choice select2-default']");
		By PickupLocation1=By.xpath("//*[@id=\"select2-drop\"]/div/input");
		By DropLocation=By.xpath("//div[@id='s2id_destination']//span[@class='select2-chosen'][contains(text(),'Enter Location')]");
		By DropLocation1=By.xpath("//div[@id='s2id_destination']//a[@class='select2-choice select2-default']");
		By Checkin=By.xpath("//input[@id='departure']");
		By Guests=By.xpath("//div[@class='col-md-1 form-group go-right col-xs-12']//input[@placeholder='0']");
		By Adults=By.xpath("//select[@id='madult']");
		By Children=By.xpath("//select[@id='mchildren']");
		By Infant=By.xpath("//select[@id='minfant']");
		By Searchbtn=By.xpath("//button[@class='btn-primary btn btn-lg btn-block pfb0']");
		
		public WebElement cookie()
		{
			return driver.findElement(cookie);
		}
		public WebElement Flight()
		{
			return driver.findElement(Flight);
		}
		public WebElement PickupLocation()
		{
			return driver.findElement(PickupLocation);
		}
		public WebElement PickupLocation1()
		{
			return driver.findElement(PickupLocation1);
		}
		public WebElement DropLocation()
		{
			return driver.findElement(DropLocation);
		}
		
		public WebElement DropLocation1()
		{
			return driver.findElement(DropLocation1);
		}
		public WebElement Checkin()
		{
			return driver.findElement(Checkin);
		}
		public WebElement Guests()
		{
			return driver.findElement(Guests);
		}
		public WebElement Adults()
		{
			return driver.findElement(Adults);
		}
		public WebElement Children()
		{
			return driver.findElement(Children);
		}
		public WebElement Infant()
		{
			return driver.findElement(Infant);
		}
		public WebElement Searchbtn()
		{
			return driver.findElement(Searchbtn);
		}
		
		
}
