package com.cse.steps;

import com.cse.page.ContractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ContractSteps {
    private WebDriver driver;
    private WebDriverWait wait;

    public ContractSteps(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(40));
    }

    public void selectViewDetails() {
        WebElement viewDetailsElement = wait.until(ExpectedConditions.visibilityOfElementLocated(ContractPage.viewDetailsButton));
        viewDetailsElement.click();
    }

    public void findContract() {
        WebElement contractElement = wait.until(ExpectedConditions.visibilityOfElementLocated(ContractPage.contract));
        contractElement.isDisplayed();
    }
}
