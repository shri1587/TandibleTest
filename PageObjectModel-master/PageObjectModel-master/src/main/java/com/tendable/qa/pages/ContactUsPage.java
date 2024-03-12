package com.tendable.qa.pages;

import com.tendable.qa.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ContactUsPage extends TestBase {

    @FindBy(xpath = "(//input[@name='fullName'])[1]")
    WebElement fullName;

    @FindBy(xpath = "(//input[@name='organisationName'])[1]")
    WebElement organisationName;

    @FindBy(xpath = "(//input[@name=cellPhone'])[1]")
    WebElement phoneNumber;

    @FindBy(xpath = "(//input[@name='email'])[1]")
    WebElement email;

    @FindBy(xpath = "//a[text()='Contact Us']")
    WebElement contactUs;

    @FindBy(xpath = "(//button[@data-loading-text='Loading...'])[1]")
    WebElement submitBtn;


    // Initializing the Page Objects:
    public ContactUsPage() {
        PageFactory.initElements(driver, this);
    }

    public void contactUsFormFill(String fname, String orgName, String number, String mail, String jobRole) {
        Select select = new Select(driver.findElement(By.name("title")));
        select.selectByValue(jobRole);

        fullName.sendKeys(fname);
        organisationName.sendKeys(orgName);
        phoneNumber.sendKeys(number);
        email.sendKeys(mail);
        submitBtn.click();

    }
}
