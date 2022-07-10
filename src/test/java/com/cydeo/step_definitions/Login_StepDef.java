package com.cydeo.step_definitions;

import com.cydeo.page.LoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.yaml.snakeyaml.LoaderOptions;

public class Login_StepDef {

    LoginPage loginPage = new LoginPage();

    @Given("user is on vytrack login page")
    public void user_is_on_vytrack_login_page() {
            Driver.getDriver().get(ConfigurationReader.getProperty("vyTrackUrl"));

    }// as a truck driver
    @When("user enters truck driver username")
    public void user_enters_truck_driver_username() {

        String username = ConfigurationReader.getProperty("driver_username");
        String password = ConfigurationReader.getProperty("driver_password");
        loginPage.login(username,password);
        BrowserUtils.waitFor(3);
    }
    @When("user enters truck driver  password")
    public void user_enters_truck_driver_password() {
        System.out.println("user enters truck driver  password");
        String username = ConfigurationReader.getProperty("driver_username");
        String password = ConfigurationReader.getProperty("driver_password");

        loginPage.login(username,password);
        BrowserUtils.waitFor(3);
    }
    @Then("user should see dashboard")
    public void user_should_see_dashboard() {
        System.out.println("user should see dashboard");
        String username = ConfigurationReader.getProperty("driver_username");
        String password = ConfigurationReader.getProperty("driver_password");
        loginPage.login(username,password);
        BrowserUtils.waitFor(3);
    }

    // as a sales Manager
    @When("user enters sales manager username")
    public void userEntersSalesManagerUsername() {
        System.out.println("user enters sales manager username");

        String username = ConfigurationReader.getProperty("driver_username");
        String password = ConfigurationReader.getProperty("driver_password");
        loginPage.login(username,password);
        BrowserUtils.waitFor(3);
    }

    @And("user enters sales manager password")
    public void userEntersSalesManagerPassword() {
        System.out.println("user enters sales manager password");

        String username = ConfigurationReader.getProperty("sales_manager_username");
        String password = ConfigurationReader.getProperty("sales_manager_password");
        loginPage.login(username,password);
        BrowserUtils.waitFor(3);
    }
    // as a store manager
    @When("user enters store manager username")
    public void userEntersStoreManagerUsername() {
        System.out.println("user enters store manager username");

        String username = ConfigurationReader.getProperty("driver_username");
        String password = ConfigurationReader.getProperty("driver_password");
        loginPage.login(username,password);
        BrowserUtils.waitFor(3);
            }
    @And("user enters store manager password")
    public void userEntersStoreManagerPassword() {
        System.out.println("user enters store manager password");

        String username = ConfigurationReader.getProperty("store_manager_username");
        String password = ConfigurationReader.getProperty("store_manager_password");
        loginPage.login(username,password);
        BrowserUtils.waitFor(3);

    }
}
