package com.opensource.demo.pages;

import com.opensource.demo.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {


    By UsernameField = By.name("username");
    By passwordField = By.name("password");
    By loginButton = By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");
    By Dashboard = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6");

    By Resetpassword=By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div/form/h6");
    public void enterUsername(String username){
        sendTextToElement(UsernameField, username);
    }

    public void enterPassword(String password){
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }


    public String verifyErrorMessage(){
        return getTextFromElement(Dashboard);
    }

    public String verifyErrorMessage1(){
        return getTextFromElement(Resetpassword);
    }


}





