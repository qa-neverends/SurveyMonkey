package com.surveymonkey.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateSurveyPage {
	
	WebDriver driver = null;
	
	WebElement createSurveyButton;

	
	public CreateSurveyPage(WebDriver driver) {
		this.driver = driver;
		
		createSurveyButton = driver.findElement(By.xpath("//a[@class='create-survey alt btn SL_split']"));
		
			}
	


	public void clickOnCreateSurvey()  {
		createSurveyButton.click();

	}
}