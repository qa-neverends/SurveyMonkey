package com.surveymonkey.Monkey;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class LoginPageTest {
	WebDriver driver = null;
	
	LoginPage lp = null;
	LandingPage lpl = null;
	CreateSurveyPage csp = null;
	SurveyTemplatesSamples sts =null;
	TemplatesPageDetails tpd =null;
	
	@BeforeTest
	void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MOHAMED\\Downloads\\WebDriver\\chromedriver.exe");
		
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\MOHAMED\\Downloads\\firefoxdriver\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		//System.setProperty("webdriver.ie.driver", "C:\\Users\\MOHAMED\\Downloads\\IEDriverServer.exe");
		//WebDriver driver = new InternetExplorerDriver();

		driver = new ChromeDriver();
		driver.get("https://www.surveymonkey.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//lp = new LoginPage(driver);
		lpl = new LandingPage(driver);
	}
	
	@AfterClass
	void tearDown() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}
	
	
	@Test (priority = 1)
	
	void TC1LoginPageButton() throws InterruptedException     {
		// Go to Login page Button  on the top of the page and click on it . 
		lpl.clicKOnLoginPageButton();
		
	}
	
	
	@Test (priority = 2)
	void TC2EnteringUserName() throws InterruptedException    {
		
		lp = new LoginPage(driver);
		// Go to user name box and type the user name 
		lp.typeUserName();
		Thread.sleep(3000);
		
	 		
		}
	
	@Test   (priority = 3)
	void TC3EnteringPassword() throws InterruptedException    {
		// Go to password box and type it
		lp.typePassword();
		Thread.sleep(3000);
		
	 	
		}
	
	
	@Test   (priority = 4)
	void TC4CheckOnRememberMe()     {
		// Go to Login Button  location and click on it. 
		lp.clicKOnRememberMe();
		WebElement corm = lp.clicKOnRememberMeTitle();
		String title = lp.gettitle(corm);
		System.out.println("Title of check box of this function is : " +title);

		Assert.assertTrue(title.contentEquals("Remember me"));
	}
	
	@Test   (priority = 5)
	void TC5LoginButton() throws InterruptedException     {
		// Go to Login Button  location and click on it. 
		lp.clickOnLoginButton();
	}
	
	
	@Test   (priority = 6)
	void TC6ClilckOnCreateSurveyButton() throws InterruptedException     {
		
		csp = new CreateSurveyPage(driver);

		// Go to create survey  location and click on it. 
		csp.clickOnCreateSurvey();
	}
	
	@Test   (priority = 7)
	void TC7TemplateSamples() throws InterruptedException     {
		
		sts = new SurveyTemplatesSamples(driver);
		
		sts.clickOnCustomerSatisfactionSurveyTemplateSample();
	}
	
	
	@Test   (priority = 8)
	void TC8TemplateDetails() throws InterruptedException     {
		
		tpd = new TemplatesPageDetails(driver);
		
		tpd.clickOnquestion();
		WebElement gtpd = tpd.getTemplatePageDetails();
		String title = tpd.gettitle(gtpd);
		
		System.out.println("NumberOfQuestions in this template is : " +title);

		
	}
}
		// Go to create survey  location and click on it. 
		//cs.clickOnCreateSurvey();
	
