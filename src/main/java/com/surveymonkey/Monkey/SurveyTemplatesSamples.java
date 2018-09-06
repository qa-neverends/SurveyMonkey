package com.surveymonkey.Monkey;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SurveyTemplatesSamples   {
	WebDriver driver = null;
	WebElement customerSatisfactionSurveyTemplate;
	




	public SurveyTemplatesSamples(WebDriver driver) {
		
		this.driver = driver;
	
	customerSatisfactionSurveyTemplate = driver.findElement(By.xpath("//p[contains(text(),'Your customers can make or break your business. He')]"));
	
		}
	

	public void clickOnCustomerSatisfactionSurveyTemplateSample()  {
		
	customerSatisfactionSurveyTemplate.click();

}
	
	
}
