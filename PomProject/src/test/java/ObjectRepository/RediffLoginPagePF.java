package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffLoginPagePF {

	WebDriver driver;
	
	public RediffLoginPagePF(WebDriver driver) {
	 
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath=".//*[@id='signin_info']/a[1]")
	
	WebElement signinLink;
	
	@FindBy(id="login1")
	
	WebElement username;
	

	@FindBy(id="password")

	WebElement password;

	@FindBy(name="proceed")

	WebElement loginbtn;
	
	@FindBy(xpath=".//div[@class='head-wrapper']/div[2]/a")

	WebElement backToHome;  // updated by kaushal joshi.

	
	public WebElement signinLink()
	{
		return signinLink;
	}
	
	public WebElement username()
	{
		return username;
	}
	
	public WebElement password()
	{
		return password;
	}
	
	public WebElement loginbtn()
	{
		return loginbtn;
	}
	
	public WebElement backToHome()
	{
		return backToHome;
	}

}
