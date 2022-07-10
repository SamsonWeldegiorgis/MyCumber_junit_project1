package com.cydeo.step_definitions;

import com.cydeo.page.LoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginStoreMgr_StepDef {

    LoginPage loginPage = new LoginPage();

    @When("user the store managers enters necessary credentials")
    public void user_the_store_managers_enters_necessary_credentials() {

        Driver.getDriver().get(ConfigurationReader.getProperty("vyTrackUrl"));
        String username = ConfigurationReader.getProperty("store_manager_username");
        String password = ConfigurationReader.getProperty("store_manager_password");
        loginPage.login(username, password);
        BrowserUtils.waitFor(3);

    }
    @Then("users should see dashboard")
    public void users_should_see_dashboard() {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Dashboard";

        Assert.assertEquals(actualTitle,expectedTitle);

         System.out.println("actualTitle = " + actualTitle);

        if(actualTitle.equals(expectedTitle)) {
            System.out.println("True = " + actualTitle);
        }else {
            System.out.println("False");

        }

//        WebElement refreshbtn = Driver.getDriver().findElement(By.xpath("//a[@title=\"Refresh\"]//following-sibling::a"));// fleet
//        WebElement resetbtn = Driver.getDriver().findElement(By.xpath("(//a[@title=\"Reset\"]//preceding-sibling::a)[2]"));// vehicle


    }
}
