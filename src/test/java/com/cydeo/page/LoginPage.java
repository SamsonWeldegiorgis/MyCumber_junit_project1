package com.cydeo.page;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(id = "prependedInput")
    public WebElement loginInput;

    @FindBy(id = "prependedInput2")
    public WebElement passwordInput;

    @FindBy(xpath = " //button[@id='_submit'] ")
    public WebElement loginButton;

    public void login(String username, String password) {
        loginInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();

    }

    public void loginDynamic(String userType) {

        userType = userType.replace(" ", "_");
        String username = ConfigurationReader.getProperty(userType + "_username");
        String password = ConfigurationReader.getProperty(userType + "_password");

        login(username, password);


    }
}

