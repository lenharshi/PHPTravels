package TestAutomation.PHPTravlels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PhpLogin1
{
	WebDriver driver;
	
	
	
	public PhpLogin1(WebDriver driver) {
	
		this.driver = driver;
	}
	By MyAccount=By.xpath("//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//a[@class='dropdown-toggle go-text-right'][contains(text(),'My Account')]");
	By Login=By.xpath("//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//ul[@class='nav navbar-nav navbar-side navbar-right sidebar go-left user_menu']//li[@id='li_myaccount']//ul[@class='dropdown-menu']//li//a[@class='go-text-right'][contains(text(),'Login')]");
	By email=By.xpath("//input[@placeholder='Email']");
	By Password=By.xpath("//input[@placeholder='Password']");
	By Loginbtn= By.xpath("//button[@class='btn btn-action btn-lg btn-block loginbtn']");
	
	public WebElement Login()
	{
		return driver.findElement(Login);
	}
	
	public WebElement MyAccount()
	{
		return driver.findElement(MyAccount);
	}
	
	public WebElement Email()
	{
		return driver.findElement(email);
	}
	public WebElement Password()
	{
		return driver.findElement(Password);
	}
	public WebElement Loginbtn()
	{
		return driver.findElement(Loginbtn);
	}
	
	
}
