package com.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseLogin {
	public void getLogin() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	
		//go to URL & maximize it
		
		driver.navigate().to("https://automationexercise.com/");
		driver.manage().window().maximize();
		// signin homepage
		driver.findElement(By.xpath("//*[@class='fa fa-lock']")).click();
		//send email in email field
		driver.findElement(By.xpath("(//input[@name='email'])[1]")).sendKeys("jesmin.ahmed.moni@gmail.com");
		//send password 
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("amma01716AE");
		//click on login
		driver.findElement(By.xpath("(//*[contains(text(),'Login')])[4]")).click();
		//Verify
		if(driver.findElement(By.xpath("//*[text()=' Logout']")).isDisplayed()) {
			System.out.println("Login Successful!");
		}else {
			System.out.println("Login Failed!");
		}
		// close current tab
		//driver.close();
		
		// close the entire browser
		driver.quit();
	}
	

}
