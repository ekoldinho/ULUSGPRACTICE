package com.ulus.pages;

import com.ulus.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {

        PageFactory.initElements(Driver.getDriver(),this);



    }

@FindBy(xpath = "//*[@id=\"username\"]")
    public WebElement username;


    @FindBy(xpath = "//*[@id=\"password\"]")
    public WebElement password;


    @FindBy(xpath = "//*[contains(text(),'Anmelden')]")
    public WebElement anmelden;



    @FindBy(xpath = "//*[contains(text(),'My Grades')]")
    public WebElement MyGrades;

    public void clickOnToolBasedOnString(String ToolName){
        Driver.getDriver().findElement(By.xpath("//*[contains(text(),"+ "'" + ToolName + "'" +  ")]")).click();
    }

    @FindBy(xpath = "//*[@id=\"filter_by_mygrades\"]/li[2]/a")
    public WebElement LastGraded;

    @FindBy(xpath = "(//div[@class='grade-value'])[1]")
    public WebElement LastGradeValue;

    @FindBy(xpath = "(//span[@class='stream_area_name'])[1]")
    public WebElement LastGradeLecture;










}
