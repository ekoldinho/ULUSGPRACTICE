package com.ulus.stepdef;

import com.ulus.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
    @Before
    public void setUpMethod(){


    }


    @After
    public void tearDownMethod(){

        Driver.closeDriver();
    }

}
