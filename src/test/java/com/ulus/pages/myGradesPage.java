package com.ulus.pages;

import com.ulus.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class myGradesPage {

    public myGradesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//ul[@class='portletList-img courseListing coursefakeclass ']//li")
    public List<WebElement> courses;

}
