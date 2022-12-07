package com.ulus.pages;

import com.ulus.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarPage {


    public CalendarPage (){
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//*[@id=\"createeventbutton\"]/span")
    public WebElement calendarText;


    @FindBy(xpath = "//*[@id=\"eventtitle\"]")
    public WebElement newEvent;

    @FindBy(xpath = "//*[@id=\"eventallday\"]")
    public WebElement allDayButton;

    @FindBy(xpath = "//button[contains(text(),'Save')]")
    public WebElement saveButton;

    @FindBy(xpath = "//*[contains(text(),'Xmas Party')]")
    public WebElement contains;








}
