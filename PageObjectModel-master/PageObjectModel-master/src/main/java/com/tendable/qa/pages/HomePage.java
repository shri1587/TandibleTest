package com.tendable.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tendable.qa.base.TestBase;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.logging.Logger;

public class HomePage extends TestBase {


	private final static Logger logger = Logger.getAnonymousLogger();

	@FindBy(xpath = "(//img[@alt='Tendable Logo']")
	static
	WebElement homePage;
		@FindBy(xpath = "//a[text()='Our Story']")
	static
	WebElement ourStory;
	
	@FindBy(xpath="//a[text()='Our Solution']")
	static
	WebElement ourSolution;
	
	@FindBy(xpath="//a[text()='Why Tendable?']")
	static
	WebElement whyTendable;
	
	@FindBy(xpath="//a[text()='Request A Demo']")
	static
	WebElement requestaDemo;

	@FindBy(xpath="//a[text()='Contact Us']")
	WebElement contactUs;


	// Initializing the Page Objects:
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	//Method to verify ourStory is accessible
	public static boolean verifyOurStory(){
		return ourStory.isDisplayed();

	}

	//Method to verify ourSolution is accessible
	public static boolean verifyOurSolution(){
		return ourSolution.isDisplayed();

	}

	//Method to verify ourStory is accessible
	public static boolean verifyWhyTendable(){
		return whyTendable.isDisplayed();

	}

	public static boolean verifyTendableLogo(){
		return homePage.isDisplayed();

	}

	//Method to validate the requestaDemo is visible on all pages
	public static boolean verifyRequestaDemo(){
		return requestaDemo.isDisplayed();
	}

	public boolean elementFound(WebElement element) {
		try {
			if (element.isDisplayed()) {
				logger.info("Element found!!!!");
				return true;
			} else {
				logger.info("Element not found/not visible");
				return false;
			}

		} catch (Exception e) {
			// driver.quit(); Commented to fix parallel test cases issue
			logger.info("Element not found/not visible");
		}
		return false;
	}


}
