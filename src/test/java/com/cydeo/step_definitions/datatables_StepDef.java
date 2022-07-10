package com.cydeo.step_definitions;

import com.cydeo.page.LoginPage;
import com.cydeo.page.VyTrackHomePage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.List;
import java.util.Map;

public class datatables_StepDef {

    VyTrackHomePage vyTrackHomePage = new VyTrackHomePage();
//    LoginPage loginPage = new LoginPage();

    @Then("user should be able to see folllowing modules")
        public void user_should_be_able_to_see_folllowing_modules(List<String> expectedModules ) throws InterruptedException {

        BrowserUtils.waitFor(3);
        Thread.sleep(3000);

        List<String> acutalModulesName =  BrowserUtils.getElementsText(vyTrackHomePage.allModules);

        Assert.assertEquals(expectedModules,acutalModulesName);

        // or the below,,,


//        public void user_should_be_able_to_see_folllowing_modules(List<String> modules ) {
//        for(String module : modules){
//            System.out.println(module);


        // or the below,,,

//    public void user_should_be_able_to_see_folllowing_modules(List<Map<String,String>> modules ) { // if we need Map way
//
//        for(Map <String, String> module : modules){
//            System.out.println(module.get("module"));

        }////////////////////////////////////////////////////////////////


    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("vyTrackUrl"));

    }

    @When("user enters below credentials")
    public void user_enters_below_credentials(Map<String, String> credentials) {

        String username = credentials.get("username");
        String password = credentials.get("password");

        new LoginPage().login(username,password);
        BrowserUtils.waitFor(3);

    }
    @Then("user should be able to see folllowing information")
    public void user_should_be_able_to_see_folllowing_information(Map<String, String> userInfo) {

        BrowserUtils.waitFor(3);
        String actualUserInfo = vyTrackHomePage.username.getText();
         String expectedUserInfo =  userInfo.get("firstname") + " " + userInfo.get("lastname");
        Assert.assertEquals(expectedUserInfo, actualUserInfo);

    }
    }
