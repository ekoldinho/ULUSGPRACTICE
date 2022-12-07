package com.ulus.pages;

import com.ulus.utilities.Driver;
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











}
