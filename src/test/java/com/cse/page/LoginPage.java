package com.cse.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    //Localizadores de elementos
    public static By userInput = By.id("email");
    public static By passInput = By.id("password");
    public static By loginButton = By.xpath("/html/body/app-root/div/app-login-form/div/div/div/div/div/div[1]/div/div[2]/form/button");

}
