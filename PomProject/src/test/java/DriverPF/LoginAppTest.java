package DriverPF;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import ObjectRepository.RediffHomePagePF;
import ObjectRepository.RediffLoginPagePF;

public class LoginAppTest {
	
	@Test
	public void kickOff()
	{
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.rediff.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		RediffLoginPagePF RLP = new RediffLoginPagePF(driver);
		
		RLP.signinLink().click();
		RLP.username().sendKeys("Admin123");
		RLP.password().sendKeys("123456");
		RLP.loginbtn().click();
		RLP.backToHome().click();
		
		RediffHomePagePF RHP = new RediffHomePagePF(driver);
		
		RHP.searchBox().sendKeys("perfume");
		RHP.ClickOnSearch().click();
	}
}
