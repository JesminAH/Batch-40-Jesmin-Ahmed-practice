package com.generic;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pagefactoryforp1.MasterPageFactoryForP1;
import com.util.BaseConfig;
import com.util.Highlighter;
import com.util.Screenshot;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTestForP1 {
	
	MasterPageFactoryForP1 mpf;
	
	public void getLogin() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	
		//go to URL & maximize it
		
		driver.navigate().to(BaseConfig.getConfigValue("URL_PROD"));
		driver.manage().window().maximize();
		mpf=new MasterPageFactoryForP1(driver);
		
	     // Highlight Homepage
		Highlighter.addColor(driver, mpf.getSigninbtn_homepage());
		// signin homepage
		mpf.getSigninbtn_homepage().click();
		//driver.findElement(By.xpath("//*[@class='fa fa-lock']")).click();
		
		  // Highlight email field
		Highlighter.addColor(driver, mpf.getEmail());
		//send email in email field
		mpf.getEmail().sendKeys(BaseConfig.getConfigValue("Email"));
		//driver.findElement(By.xpath("(//input[@name='email'])[1]")).sendKeys("jesmin.ahmed.moni@gmail.com");
		
		// Highlight password field
		Highlighter.addColor(driver, mpf.getPassword());
		//send password 
		mpf.getPassword().sendKeys(BaseConfig.getConfigValue("Password"));
		//driver.findElement(By.xpath("//*[@name='password']")).sendKeys("amma01716AE");
		
		// Highlight login field
		Highlighter.addColor(driver, mpf.getLogin());
		//click on login
		mpf.getLogin().click();
		//driver.findElement(By.xpath("(//*[contains(text(),'Login')])[4]")).click();
		
		//Verify
		if(mpf.getLogout().isDisplayed()) {
			System.out.println("Login Successful!");
		}else {
			System.out.println("Login Failed!");
		}
		
		//Screenshot
		
		Screenshot.getScreenShot(driver, "Homepage_after_login");
		// close current tab
		//driver.close();
		
		// close the entire browser
		driver.quit();
	}

}
