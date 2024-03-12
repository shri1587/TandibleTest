/*
 * @author Naveen Khunteta
 * 
 */

package com.tendable.qa.testcases;

import com.tendable.qa.pages.ContactUsPage;
import com.tendable.qa.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.tendable.qa.base.TestBase;
import com.tendable.qa.util.TestUtil;

public class ContactUsPageTest extends TestBase{

	HomePage homePage;
	TestUtil testUtil;
	ContactUsPage contactUsPage;

	public ContactUsPageTest(){
			super();
			
	}
	
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		
		initialization();
		testUtil = new TestUtil();
		contactUsPage = new ContactUsPage();
				testUtil.switchToFrame();

	}
	
	@Test
	public void verifycontactUsPageLabel(){
		Assert.assertTrue(homePage.verifyRequestaDemo(), "Request a demo is visible");
	}


	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

	
}
