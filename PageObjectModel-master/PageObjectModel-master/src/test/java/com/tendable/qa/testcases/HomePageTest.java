package com.tendable.qa.testcases;

import com.tendable.qa.pages.ContactUsPage;
import com.tendable.qa.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.tendable.qa.base.TestBase;
import com.tendable.qa.util.TestUtil;

public class HomePageTest extends TestBase {
	HomePage homePage;
	TestUtil testUtil;
	ContactUsPage contactUsPage;

	public HomePageTest() {
		super();
	}

	//test cases should be separated -- independent with each other
	//before each test case -- launch the browser and login
	//@test -- execute test case
	//after each test case -- close the browser
	
	@BeforeMethod
	public void setUp() {
		initialization();
		testUtil = new TestUtil();
	}
//Methods to verify the visibility of the elements on the home page

	@Test
	public void verifyOurStoryisVisible(){
		Assert.assertTrue(homePage.verifyOurStory(), "Our Story is visible");
	}

	@Test
	public void verifyOurSolutionisVisible(){
		Assert.assertTrue(homePage.verifyOurSolution(), "Our Solution is visible");
	}

	@Test
	public void verifywhyTendableisVisible(){
		Assert.assertTrue(homePage.verifyWhyTendable(), "Why Tendable is visible");
	}

	@Test
	public void verifyRequestaDemoisVisible(){
		Assert.assertTrue(homePage.verifyRequestaDemo(), "Request a demo is visible");
	}

	@Test
	public void verifyTendableHomePageisVisible(){
		Assert.assertTrue(homePage.verifyTendableLogo(), "Tendable home page is visible");
	}


	@AfterMethod
	public void closeBrowser(){
		driver.quit();
	}
	
	

}
