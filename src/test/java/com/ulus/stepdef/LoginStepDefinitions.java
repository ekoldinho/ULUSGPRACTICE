package com.ulus.stepdef;

import com.ulus.pages.LoginPage;
import com.ulus.utilities.ConfigurationReader;
import com.ulus.utilities.Driver;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;

public class LoginStepDefinitions {

    LoginPage loginPage = new LoginPage();

    @Given("user is on the Blackboard login page")
    public void user_is_on_the_blackboard_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("web.url"));
    }


    @Given("user passes {string} username and password {string} and clicks on login")
    public void userPassesUsernameAndPasswordAndClicksOnLogin(String arg0, String arg1) {
Driver.getDriver().findElement(By.xpath("//*[@id=\"buttonLoginShibboleth\"]")).click();
loginPage.username.sendKeys(arg0);
loginPage.password.sendKeys(arg1);
loginPage.anmelden.click();




    }

    @Given("user succesfully lands on Blackboard homepage")
    public void userSuccesfullyLandsOnBlackboardHomepage() {

        System.out.println("asdasdasdasdasd");
    }

    @Given("user is sleeping")
    public void userIsSleeping() {

        System.out.println("daskasıhdalsıfhaslıfhsaoıfgh");
    }
}
