package com.surveymonkey.Monkey;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TemplatesPageDetails extends BasePageOfTemplates {

	
	WebDriver driver = null;
	
	
	
	public TemplatesPageDetails(WebDriver driver) {
		super(driver);
		
		
		this.driver = driver;
		
		
		
	}



	public void clickOnquestion() {
		
		quesions.click();

		
	}



	public WebElement getTemplatePageDetails() {
		// TODO Auto-generated method stub
		return numberOfQuestios;
				}
	
	public String gettitle(WebElement elm) {
		String text = elm.getText();
		return text;
	}




}
