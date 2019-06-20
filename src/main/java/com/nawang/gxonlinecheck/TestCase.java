package com.nawang.gxonlinecheck;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase extends BaseMethod{
    @Test
    public void gxOnlineCheckCase001(){
        WebDriver driver = new ChromeDriver();
        driver.get("http://xn--fhqywn2dsxdr4e505aexie2bv31fi44ao5pljb.xn--fiqs8s/");
        driver.switchTo().frame("main");
//        WebDriverWait wait = new WebDriverWait(driver,10,1);
//
//        wait.until(new ExpectedCondition<WebElement>() {
//            @NullableDecl
//            public WebElement apply(@NullableDecl WebDriver webDriver) {
//                return webDriver.findElement(By.cssSelector("/html/body/div[2]/div/div[2]/div[1]/ul[1]/li[1]/a"));
//            }
//        }).click();
        driverWait(driver,"/html/body/div[2]/div/div[1]/dl/dd[2]/a");
        String title = driver.getTitle();
        System.out.println(title);
        System.out.println(driver.getCurrentUrl());
        //*[@id='kw']
//        body > div.date-con.main.g-pb50 > div > div.company-head > dl > dd.company-headHandle.fr > a

    }
}
