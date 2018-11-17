package DriverPF;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import ObjectRepository.RediffHomePagePF;
import ObjectRepository.RediffLoginPagePF;

public class LoginAppTest {
	WebDriver driver;
	@Test
	public void kickOff()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe"); // code added by admin on 4/10/2018
		driver = new ChromeDriver();
		
		driver.get("http://www.rediff.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.manage().deleteAllCookies(); 				// code added by Admin on 10/4/2018
		
		RediffLoginPagePF RLP = new RediffLoginPagePF(driver);
		
		RLP.signinLink().click();
		RLP.username().sendKeys("Admin123");
		RLP.password().sendKeys("123456");
		RLP.loginbtn().click();
		RLP.backToHome().click();
		
		RediffHomePagePF RHP = new RediffHomePagePF(driver);
		
		RHP.searchBox().sendKeys("perfume");
		RHP.ClickOnSearch().click();
		RHP.RSignIn().click(); 
		driver.close();    // added by kaushal on 17/11/2018 testing purpose...
		
	}
}
