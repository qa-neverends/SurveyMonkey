package com.surveymonkey.Monkey;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

	public class LandingPage {

	
	WebDriver driver = null;
	
	WebElement loginpageButton;



	public LandingPage(WebDriver driver) {
	this.driver = driver;
	
	loginpageButton = driver.findElement(By.cssSelector("#hd > div > div > ol > li:nth-child(1) > a"));
	
		}

	public void clicKOnLoginPageButton() {
		loginpageButton.click();

		}
}
	