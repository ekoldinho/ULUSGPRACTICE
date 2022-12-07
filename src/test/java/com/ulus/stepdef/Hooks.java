package com.ulus.stepdef;

import com.ulus.utilities.Driver;
import org.junit.After;
import org.junit.Before;

public class Hooks {
    @Before
    public void setUpMethod(){


    }


    @After
    public void tearDownMethod(){

        Driver.closeDriver();
    }

}
