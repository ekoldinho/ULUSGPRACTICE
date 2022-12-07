package com.ulus.stepdef;

import com.ulus.pages.LoginPage;
import com.ulus.utilities.ConfigurationReader;
import com.ulus.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;

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
        System.out.println("User is on Blackboard :)");
    }

    @Given("user is sleeping")
    public void userIsSleeping() {

        System.out.println("daskasıhdalsıfhaslıfhsaoıfgh");
    }

    @Given("user clicks on {string} tool")
    public void userClicksOnTool(String arg0) {

        loginPage.clickOnToolBasedOnString(arg0);
    }

    @And("user clicks on Last Graded link")
    public void userClicksOnLastGradedLink() throws InterruptedException {

    loginPage.LastGraded.click();
    }


    @Then("user takes a ss for grades")
    public void userSeesHisHerLastGradeAndLectureName() throws IOException, InterruptedException {
        Thread.sleep(5000);
        File scrFile = ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.FILE);
// Now you can do whatever you need to do with it, for example copy somewhere
        FileUtils.copyFile(scrFile, new File("C:\\Users\\Yakup Alihan Tamgüç\\Desktop\\masasüstü\\Grades.png"));
    }
}
