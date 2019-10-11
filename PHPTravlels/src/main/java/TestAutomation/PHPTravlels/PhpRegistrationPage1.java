package TestAutomation.PHPTravlels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PhpRegistrationPage1 
{
	WebDriver driver;
	public PhpRegistrationPage1(WebDriver driver) 
	{
		
		this.driver = driver;
	}
	By MyAccount=By.xpath("//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//a[@class='dropdown-toggle go-text-right'][contains(text(),'My Account')]");
	By signUp=By.xpath("//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//ul[@class='nav navbar-nav navbar-side navbar-right sidebar go-left user_menu']//li[@id='li_myaccount']//ul[@class='dropdown-menu']//li//a[@class='go-text-right'][contains(text(),'Sign Up')]");
	By Firstname=By.xpath("//input[@placeholder='First Name']");
	By Lastname=By.xpath("//input[@placeholder='Last Name']");
	By Mobileno=By.xpath("//input[@placeholder='Mobile Number']");
	By email=By.xpath("//input[@placeholder='Email']");
	By Password=By.xpath("//input[@placeholder='Password']");
	By ConfirmPassword=By.xpath("//input[@placeholder='Confirm Password']");
	By Cookie=By.xpath("//button[@id='cookyGotItBtn']");
	By submit=By.xpath("//button[@class='signupbtn btn_full btn btn-action btn-block btn-lg']");
	
	public WebElement MyAccount()
	{
		return driver.findElement(MyAccount);
	}
	
	public WebElement signUp()
	{
		return driver.findElement(signUp);
	}
	public WebElement Firstname()
	{
		return driver.findElement(Firstname);
	}
	public WebElement Lastname()
	{
		return driver.findElement(Lastname);	
	}
	public WebElement Mobileno()
	{
		return driver.findElement(Mobileno);
	}
	public WebElement email()
	{
		return driver.findElement(email);
	}
	public WebElement Password()
	{
		return driver.findElement(Password);
	}
	public WebElement ConfirmPassword()
	{
		return driver.findElement(ConfirmPassword);
	}
	public WebElement Cookie ()
	{
		return driver.findElement(Cookie);
	}
	public WebElement submit()
	{
		return driver.findElement(submit);
	}
}
