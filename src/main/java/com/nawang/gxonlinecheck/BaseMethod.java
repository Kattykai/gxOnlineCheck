package com.nawang.gxonlinecheck;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BaseMethod {
    public void driverWait(WebDriverWait wait,WebDriver driver, final String xpath){
        wait = new WebDriverWait(driver,10,1);
        wait.until(new ExpectedCondition<WebElement>() {
            @NullableDecl
            public WebElement apply(@NullableDecl WebDriver driver) {
                return driver.findElement(By.xpath(xpath));
            }
        });
    }

    public boolean isElementPresent(By by,WebDriver driver){
        try{
            driver.findElement(by);
            return true;
        }catch(Exception e){
            return false;
        }
    }

    public void bannerCheck(WebDriver driver) throws InterruptedException {
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"publicMainInformation\"]/div/ul/li[3]/div/em")).getText(),"信用官网金牌示范单位");
        Assert.assertEquals(driver.findElement(By.className("shamWeb")).getText(),"虚假或欺诈网站 安全");
        Assert.assertEquals(driver.findElement(By.className("spiteWeb")).getText(),"挂马或恶意网站 安全");
        driver.findElement(By.id("publicInfoHide")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("publicStatusHide")).click();
        Thread.sleep(1000);
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"hideBtn\"]")).getAttribute("class"),"show");
        driver.findElement(By.xpath("//*[@id=\"hideBtn\"]")).click();
        Thread.sleep(1000);
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"hideBtn\"]")).getAttribute("class"),"hide");
    }


}
