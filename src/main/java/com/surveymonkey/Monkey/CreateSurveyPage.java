package com.surveymonkey.Monkey;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateSurveyPage {
	
	WebDriver driver = null;
	
	WebElement createSurveyButton;

	
	public CreateSurveyPage(WebDriver driver) {
		this.driver = driver;
		
		createSurveyButton = driver.findElement(By.xpath("//a[@id='button-create-survey-ribbon']"));
		
			}
		


	public void clickOnCreateSurvey()  {
		createSurveyButton.click();

	}
}