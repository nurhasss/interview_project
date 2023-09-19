package com.interview.pages;

import com.interview.utilities.ConfigurationReader;
import com.interview.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id="user")
    public WebElement userName;



    @FindBy(id="password")
    public WebElement password;

    @FindBy(id = "submit-form")
    public WebElement submit;

    public void EmployerLogin(){
        userName.sendKeys(ConfigurationReader.getProperty("username"));
        password.sendKeys(ConfigurationReader.getProperty("password"));
        submit.click();
    }


    public void login(String userNameStr, String passwordStr) {
        userName.sendKeys(userNameStr);
        password.sendKeys(passwordStr);
        submit.click();
        // verification that we logged
    }

}
