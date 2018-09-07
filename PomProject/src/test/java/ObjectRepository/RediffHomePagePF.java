package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffHomePagePF {
	
	WebDriver driver;
	
	public RediffHomePagePF(WebDriver driver) {
	 this.driver = driver;
	 PageFactory.initElements(driver, this);
	}

	@FindBy(name ="srchword")
	WebElement searchBox;
	
	@FindBy(className ="newsrchbtn")
	WebElement ClickOnSearch;
	
	public WebElement searchBox()
	{
		return searchBox;
	}
	
	
	public WebElement ClickOnSearch()
	{
		return ClickOnSearch;
	}
			

}
