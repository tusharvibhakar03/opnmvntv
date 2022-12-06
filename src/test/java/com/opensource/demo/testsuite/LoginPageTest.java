package com.opensource.demo.testsuite;

import com.opensource.demo.pages.HomePage;
import com.opensource.demo.pages.LoginPage;
import com.opensource.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();


    @Test
    
    public void userSholdLoginSuccessfullyWithValidCredentials(){
        homePage.clickOnLoginLink();
        loginPage.enterUsername("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginButton();
        String expectedText="Dashboard";
        String actualText= loginPage.verifyErrorMessage();
        Assert.assertEquals(actualText,expectedText,"Dashboard");

    }


@Test
    public void verifyforgetpasswordmessage(){
        homePage.clickOnforgetpasswordlink();
    String expectedText="Reset Password";
    String actualText= loginPage.verifyErrorMessage1();
    Assert.assertEquals(actualText,expectedText,"Reset Password");


}






}
