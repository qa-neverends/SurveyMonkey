package com.surveymonkey.Monkey;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

		// TODO Auto-generated constructor stub
		
		WebDriver driver = null;
		
		WebElement usernameCell;
		WebElement passwordCell;
		WebElement rememberMeCB; //  CB : Check Box
		WebElement loginButton;
		WebElement createSurveyButton;

		
				
				
	

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		
		
		usernameCell = driver.findElement(By.id("username"));
		
		/*WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement usernameCell = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));*/
		
		//WebElement usernameCellt = (new WebDriverWait(driver, 20)).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#username")));
		
		
		//new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#username")));
		passwordCell = driver.findElement(By.id("password"));
		//WebElement passwordCell = (new WebDriverWait(driver, 15)).until(ExpectedConditions.presenceOfElementLocated(By.id("password")));

		rememberMeCB = driver.findElement(By.xpath("//label[contains(text(),'Remember me')]"));
		//WebElement rememberMeCB = (new WebDriverWait(driver, 20)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//label[contains(text(),'Remember me')]")));
		
		loginButton = driver.findElement(By.xpath("//button[@type='submit']"));

		//
		//WebElement createSurveyButton = (new WebDriverWait(driver, 20)).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#button-create-survey-ribbon")));
		
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		//WebElement createSurveyButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("#button-create-survey-ribbon")));
		

		
	}
	
	
	
	
	public void typeUserName()   {
		usernameCell.sendKeys("Aliprince");
	}
	
	
	
	public void typePassword()   {
		passwordCell.sendKeys("Mm0923097861");
	}
	
	public void clicKOnRememberMe() {
		rememberMeCB.click();
		

	}
	
	public WebElement clicKOnRememberMeTitle() {
		return rememberMeCB;

	}
	
	public String gettitle(WebElement elm) {
		String text = elm.getText();
		return text;
	}
	
	public void clickOnLoginButton() throws InterruptedException {
		loginButton.click();
		Thread.sleep(5000);

	}
	
	



	
}
