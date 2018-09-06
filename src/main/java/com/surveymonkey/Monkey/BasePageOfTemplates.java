package com.surveymonkey.Monkey;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePageOfTemplates {
	
	WebDriver driver = null;
	
	
	WebElement Overview;
	WebElement quesions;
	WebElement sampleResults;
	WebElement useThisTemplatesButton;
	WebElement closeButton;
	WebElement numberOfQuestios;
	

public BasePageOfTemplates(WebDriver driver) {
		
		this.driver = driver;
	
		Overview = driver.findElement(By.xpath("//span[contains(text(),'OVERVIEW')]"));
		quesions = driver.findElement(By.xpath("//span[contains(text(),'QUESTIONS')]"));
		sampleResults = driver.findElement(By.xpath("//span[contains(text(),'SAMPLE RESULTS')]"));
		useThisTemplatesButton = driver.findElement(By.xpath("//span[contains(text(),'SAMPLE RESULTS')]"));
		//closeButton = driver.findElement(By.xpath("//div[@class='close-button smf-icon']"));
		numberOfQuestios = driver.findElement(By.xpath("//h4[contains(text(),'Number of questions')]"));
		}


}
