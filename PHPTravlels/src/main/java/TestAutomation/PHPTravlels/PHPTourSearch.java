package TestAutomation.PHPTravlels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PHPTourSearch {
	WebDriver driver;

	public PHPTourSearch(WebDriver driver) {
		
		this.driver = driver;
	}
	By Tours=By.xpath("//a[@title='Tours']");
	By ToursSearch=By.xpath("//div[@id='s2id_autogen3']//a[@class='select2-choice select2-default']");
	By TourSearchKeys=By.xpath("/html[1]/body[1]/div[6]/section[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/a[1]");
	By TourLink=By.xpath("/html[1]/body[1]/div[20]/ul[1]/li[1]/ul[1]/li[1]/div[1]");
	By Checkin=By.xpath("//div[@id='tchkin']//input[@placeholder='Check in']");
	By Guests=By.xpath("//select[@id='adults']");
	By TourType=By.xpath("//select[@id='tourtype']");
	By Searchbtn=By.xpath("//div[@class='col-md-2 form-group go-right col-xs-12 search-button']//button[@class='btn-primary btn btn-lg btn-block pfb0 loader'][contains(text(),'Search')]");
	public WebElement Tours()
	{
		return driver.findElement(Tours);
	}
	public WebElement ToursSearch()
	{
		return driver.findElement(ToursSearch);
	}
	public WebElement TourSearchKeys()
	{
		return driver.findElement(TourSearchKeys);
	}
	public WebElement TourLink()
	{
		return driver.findElement(TourLink);
	}
	public WebElement Checkin()
	{
		return driver.findElement(Checkin);
	}
	public WebElement Guests()
	{
		return driver.findElement(Guests);
	}
	public WebElement TourType()
	{
		return driver.findElement(TourType);
	}
	public WebElement Searchbtn()
	{
		return driver.findElement(Searchbtn);
	}
}
