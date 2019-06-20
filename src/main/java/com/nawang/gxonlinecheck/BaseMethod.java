package com.nawang.gxonlinecheck;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseMethod {
    WebDriverWait webDriverWait;
    public void driverWait(WebDriver driver, final String xpath){

        webDriverWait = new WebDriverWait(driver,10,1);
        webDriverWait.until(new ExpectedCondition<WebElement>() {
            @NullableDecl
            public WebElement apply(@NullableDecl WebDriver driver) {
                return driver.findElement(By.xpath(xpath));
            }
        }).click();
    }


}
