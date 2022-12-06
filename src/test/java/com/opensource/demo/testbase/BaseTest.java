package com.opensource.demo.testbase;

import com.opensource.demo.propertyreader.PropertyReader;
import com.opensource.demo.utility.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utility {

    String browser= PropertyReader.getInstance().getProperty("browser");

    @BeforeMethod
    public void setup(){
        selectBrowser(browser);
    }

    @AfterMethod
    public void tearDown(){
        closeBrowser();

    }


}
