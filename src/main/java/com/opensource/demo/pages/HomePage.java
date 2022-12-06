package com.opensource.demo.pages;

import com.opensource.demo.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By loginLink = (By.xpath("//button[@type=\"submit\"]"));

    By forgetpasswordlink =By.xpath("//p[@class=\"oxd-text oxd-text--p orangehrm-login-forgot-header\"]");


    public void clickOnLoginLink(){
        clickOnElement(loginLink);
    }

    public void clickOnforgetpasswordlink(){clickOnElement(forgetpasswordlink);}



     }






