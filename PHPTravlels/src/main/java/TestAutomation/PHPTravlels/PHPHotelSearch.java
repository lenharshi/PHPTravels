package TestAutomation.PHPTravlels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PHPHotelSearch 
{
	WebDriver driver;
	public PHPHotelSearch(WebDriver driver) {
		
		this.driver = driver;
	}
	By HotelSearch =By.xpath("//li[@class='active text-center']//a[@class='text-center']");
	By PickUp=By.xpath("//div[@id='s2id_location']//a[@class='select2-choice select2-default']");
	By PickUpKeys=By.xpath("//div[@id='s2id_location']//a[@class='select2-choice select2-default']");
	By PickUpSelect=By.xpath("//div[contains(text(),', India')]");
	By Checkin=By.xpath("//div[@id='dpd1']//input[@placeholder='Check in']");
	By guest=By.xpath("//input[@id='htravellersInput']");
	By Adults=By.xpath("//button[@id='hadultPlusBtn']");
	By child=By.xpath("//button[@id='hchildPlusBtn']");
	By searchbtn=By.xpath("//button[@class='btn btn-lg btn-block btn-primary pfb0 loader']");
	
	
	public WebElement HotelSearch()
	{
		return driver.findElement(HotelSearch);
	}
	public WebElement PickUp()
	{
		return driver.findElement(PickUp);
	}
	public WebElement PickUpKeys()
	{
		return driver.findElement(PickUpKeys);
	}
	public WebElement PickUpSelect()
	{
		return driver.findElement(PickUpSelect);
	}
	public WebElement Checkin()
	{
		return driver.findElement(Checkin);
		
	}
	public WebElement guest()
	{
		return driver.findElement(guest);
		
	}
	public WebElement Adults()
	{
		return driver.findElement(Adults);
		
	}
	public WebElement child()
	{
		return driver.findElement(child);
		
	}
	public WebElement searchbtn()
	{
		return driver.findElement(searchbtn);
		
	}
	

}

