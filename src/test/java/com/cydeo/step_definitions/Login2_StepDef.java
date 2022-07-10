package com.cydeo.step_definitions;

import com.cydeo.page.LoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Login2_StepDef {

    LoginPage loginPage = new LoginPage();

    @When("user the truck driver enters necessary credentials")
    public void user_the_truck_driver_enters_necessary_credentials() {

        Driver.getDriver().get(ConfigurationReader.getProperty("vyTrackUrl"));
        String username = ConfigurationReader.getProperty("driver_username");
        String password = ConfigurationReader.getProperty("driver_password");
        loginPage.login(username, password);
        BrowserUtils.waitFor(3);


    }

    @When("user the sales manager enters necessary credentials")
    public void user_the_sales_manager_enters_necessary_credentials() {
        Driver.getDriver().get(ConfigurationReader.getProperty("vyTrackUrl"));
        String username = ConfigurationReader.getProperty("sales_manager_username");
        String password = ConfigurationReader.getProperty("sales_manager_password");
        loginPage.login(username, password);
        BrowserUtils.waitFor(3);

    }

    @When("user the store manager enters necessary credentials")
    public void user_the_store_manager_enters_necessary_credentials() {
        Driver.getDriver().get(ConfigurationReader.getProperty("vyTrackUrl"));
        String username = ConfigurationReader.getProperty("store_manager_username");
        String password = ConfigurationReader.getProperty("store_manager_password");
        loginPage.login(username, password);
        BrowserUtils.waitFor(3);
        WebElement refreshbtn = Driver.getDriver().findElement(By.xpath("//a[@title=\"Refresh\"]//following-sibling::a"));// fleet
        WebElement resetbtn = Driver.getDriver().findElement(By.xpath("(//a[@title=\"Reset\"]//preceding-sibling::a)[2]"));// vehicle


    }

    @Then("user should sees dashboard")
    public void user_should_sees_dashboard() {
        Driver.getDriver().findElement(By.xpath("(//span[@class=\"title title-level-1\"])[1]")).click();
        Driver.getDriver().findElement(By.xpath("(//span[@class=\"title title-level-2\"])[1]")).click();
        BrowserUtils.waitFor(3);


    }

    @When("user enters the {string} information")
    public void user_enters_the_information(String userType) {
        Driver.getDriver().get(ConfigurationReader.getProperty("vyTrackUrl"));
        loginPage.loginDynamic(userType);
    }
}