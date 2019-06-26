package com.nawang.gxonlinecheck;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.awt.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class gxOnlineCheckCase extends BaseMethod{
    WebDriver driver ;


    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    /**
     * ��1���Ϻ��������Źɷ����޹�˾���Ϻ��������Źɷ����޹�˾.�й�   �鿴ҳ���Ƿ���ʾ����
     * @throws InterruptedException
     */
    @Test
    public void gxOnlineCheckCase001() throws InterruptedException {
        Reporter.log("http://�Ϻ��������Źɷ����޹�˾.�й�");
        driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
        driver.get("http://xn--fhqywn2dsxdr4e505aexie2bv31fi44ao5pljb.xn--fiqs8s/");
        driver.switchTo().frame("main");
        Thread.sleep(2000);
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.textToBe(By.xpath("/html/body/div[2]/div/div[1]/dl/dd[1]/ul/li[1]/h2/a"),"�Ϻ��������Źɷ����޹�˾"));
        Assert.assertEquals(driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/dl/dd[1]/ul/li[1]/h2/a")).getText(), "�Ϻ��������Źɷ����޹�˾");
        Assert.assertEquals(driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/dl/dd[1]/ul/li[2]/span[1]")).getText(), "�绰��021-22011888");
        Assert.assertEquals(driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/dl/dd[1]/ul/li[2]/span[2]")).getText(), "���䣺saicmotor@saicmotor.com");
        Assert.assertEquals(driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/dl/dd[1]/ul/li[3]/span")).getText(), "��ַ���й����Ϻ�������ó������������·563��1��¥509��");
        Assert.assertEquals(driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/dl/dd[1]/ul/li[4]/div/a")).getText(), "http://www.saicmotor.com");
    }

    /**
     * (2)��ҩ�������޹�˾����ҩ�������޹�˾.�й�  �鿴ҳ���Ƿ���ʾ������ͨ���Ƿ���ʾ����
     * @throws InterruptedException
     */
    @Test
    public void gxOnlineCheckCase002() throws InterruptedException {
        Reporter.log("http://��ҩ�������޹�˾.�й�");
        driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
        driver.get("http://xn--55qx5d1ri1ez65ai42bxv1a50a.xn--fiqs8s/");
        driver.switchTo().frame("main");
        Thread.sleep(2000);
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"companyNameBox\"]/p/em/a"),"��ҩ�������޹�˾"));
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"companyNameBox\"]/p/em/a")).getText(),"��ҩ�������޹�˾");
        bannerCheck(driver);
    }

    /**
     * ��3��tcl���Źɷ����޹�˾��	tcl���Źɷ����޹�˾.�й�                    �鿴ҳ���Ƿ���ʾ����
     * @throws InterruptedException
     */
    @Test
    public void gxOnlineCheckCase003() throws InterruptedException {
        Reporter.log("http://tcl���Źɷ����޹�˾.�й�");
        driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
        driver.get("http://xn--tcl-pv9d94i15eergg72b0e2ccl5b7bb.xn--fiqs8s/");
        driver.switchTo().frame("main");
        Thread.sleep(2000);
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.textToBe(By.className("cursor-default"),"TCL���Źɷ����޹�˾"));
        Assert.assertEquals(driver.findElement(By.className("cursor-default")).getText(),"TCL���Źɷ����޹�˾");
        Assert.assertEquals(driver.findElement(By.className("company-contact")).getText(),"�绰��0752-2288333 ���䣺-");
        Assert.assertEquals(driver.findElement(By.className("company-site")).getText(),"��ַ���㶫ʡ�������������¼���������ʮ�ź�С��");
        Assert.assertEquals(driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/dl/dd[1]/ul/li[4]/div/a")).getText(),"http://www.tcl.com");
    }

    /**
     * ��4��ũ��ɽȪ�ɷ����޹�˾��			ũ��ɽȪ�ɷ����޹�˾.�й�   �鿴ҳ���Ƿ���ʾ������ͨ���Ƿ���ʾ����
     * @throws InterruptedException
     */
    @Test
    public void gxOnlineCheckCase004() throws InterruptedException {
        Reporter.log("http://ũ��ɽȪ�ɷ����޹�˾.�й�");
        driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
        driver.get("http://xn--doq22dces0hctjx9epowoqkk48bcl7b.xn--fiqs8s/");
        driver.switchTo().frame("main");
        Thread.sleep(2000);
//        wait.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"companyNameBox\"]/p/em/a")," ũ��ɽȪ�ɷ����޹�˾"));
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"companyNameBox\"]/p/em/a")).getText(),"ũ��ɽȪ�ɷ����޹�˾");
        bannerCheck(driver);
    }

    /**
     *
     * ��5����һ�ع��ɷ����޹�˾��	��һ�ع��ɷ����޹�˾.�й�                   �鿴ҳ���Ƿ���ʾ����
     * @throws InterruptedException
     */
    @Test
    public void gxOnlineCheckCase005() throws InterruptedException {
        Reporter.log("http://��һ�ع��ɷ����޹�˾.�й�");
        driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
        driver.get("http://xn--4gqra74eh5efrespub8otj2cmk6aepj.xn--fiqs8s/");
        driver.switchTo().frame("main");
        Thread.sleep(2000);
//        wait.until(ExpectedConditions.textToBe(By.className("cursor-default")," ��һ�ع��ɷ����޹�˾"));
        Assert.assertEquals(driver.findElement(By.className("cursor-default")).getText(),"��һ�ع��ɷ����޹�˾");
        Assert.assertEquals(driver.findElement(By.className("company-contact")).getText(),"�绰��010-60738888 ���䣺sanyir@sany.com.cn");
        Assert.assertEquals(driver.findElement(By.className("company-site")).getText(),"��ַ�������в�ƽ������·8��6��5¥");
        Assert.assertEquals(driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/dl/dd[1]/ul/li[4]/div/a")).getText(),"http://www.sanyhi.com");
    }

    /**
     * ��6�������㰲�������޹�˾��	�����㰲�������޹�˾.�й�   �鿴ҳ���Ƿ���ʾ������ͨ���Ƿ���ʾ����
     * @throws InterruptedException
     */
    @Test
    public void gxOnlineCheckCase006() throws InterruptedException {
        Reporter.log("http://�����㰲�������޹�˾.�й�");
        driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
        driver.get("http://xn--55qx5d59cd2g33e89b4ut079a8c6cw7a.xn--fiqs8s/");
        driver.switchTo().frame("main");
        Thread.sleep(2000);
//        wait.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"companyNameBox\"]/p/em/a")," �����㰲�������޹�˾"));
        bannerCheck(driver);
    }

    /**
     * ��7���ൺ�����ɷ����޹�˾��	�ൺ�����ɷ����޹�˾.�й�    �鿴ҳ���Ƿ���ʾ����
     * @throws InterruptedException
     */
    @Test
    public void gxOnlineCheckCase007() throws InterruptedException {
        Reporter.log("http://�ൺ�����ɷ����޹�˾.�й�");
        driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
        driver.get("http://xn--doq22d51cg7mjtaw41cetkot2bq13bsdc.xn--fiqs8s/");
        driver.switchTo().frame("main");
        Thread.sleep(2000);
//        wait.until(ExpectedConditions.textToBe(By.className("cursor-default")," ��һ�ع��ɷ����޹�˾"));
        Assert.assertEquals(driver.findElement(By.className("cursor-default")).getText(),"�ൺ�����ɷ����޹�˾");
        Assert.assertEquals(driver.findElement(By.className("company-contact")).getText(),"�绰��0532-86762198 ���䣺liuxiaol@haier.com");
        Assert.assertEquals(driver.findElement(By.className("company-site")).getText(),"��ַ���ൺ����ɽ��������ҵ԰��");
        Assert.assertEquals(driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/dl/dd[1]/ul/li[4]/div/a")).getText(),"http://www.linkcook.cn");
    }

    /**
     * ��8�������ҵ�ɷ����޹�˾��			�����ҵ�ɷ����޹�˾.�й�   �鿴ҳ���Ƿ���ʾ������ͨ���Ƿ���ʾ����
     * @throws InterruptedException
     */
    @Test
    public void gxOnlineCheckCase008() throws InterruptedException {
        Reporter.log("http://�����ҵ�ɷ����޹�˾.�й�");
        driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
        driver.get("http://xn--chqrbv8boa112a15ef47b4n5as2mcf5c.xn--fiqs8s/");
        driver.switchTo().frame("main");
        Thread.sleep(2000);
//        wait.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"companyNameBox\"]/p/em/a")," �����㰲�������޹�˾"));
        bannerCheck(driver);
    }

    /**
     *��9����Ϊ�������޹�˾����Ϊ�������޹�˾.�й�    �鿴ҳ���Ƿ���ʾ������ͨ���Ƿ���ʾ����
     * @throws InterruptedException
     */
    @Test
    public void gxOnlineCheckCase009() throws InterruptedException {
        Reporter.log("http://��Ϊ�������޹�˾.�й�");
        driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
        driver.get("http://xn--siqt1fjybrtt77cbhguh7065a.xn--fiqs8s/");
        driver.switchTo().frame("main");
        Thread.sleep(2000);
//        wait.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"companyNameBox\"]/p/em/a")," �����㰲�������޹�˾"));
        bannerCheck(driver);
    }

    /**
     * ��10�������ٶ���Ѷ�Ƽ����޹�˾��	�����ٶ���Ѷ�Ƽ����޹�˾.�й�   �鿴ҳ���Ƿ���ʾ������ͨ���Ƿ���ʾ����
     * @throws InterruptedException
     */
    @Test
    public void gxOnlineCheckCase010() throws InterruptedException {
        Reporter.log("http://�����ٶ���Ѷ�Ƽ����޹�˾.�й�");
        driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
        driver.get("http://xn--1lqw0etvb1zas40bbtfh6inn7a4igjyob96a9w0a.xn--fiqs8s/");
        driver.switchTo().frame("main");
        Thread.sleep(2000);
//        wait.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"companyNameBox\"]/p/em/a")," �����㰲�������޹�˾"));
        bannerCheck(driver);
    }

    /**
     * ��11������Ӱ�ɷ����޹�˾��	����Ӱ�ɷ����޹�˾.�й�     �鿴ҳ���Ƿ���ʾ������ͨ���Ƿ���ʾ����
     * @throws InterruptedException
     */
    @Test
    public void gxOnlineCheckCase011() throws InterruptedException {
        Reporter.log("http://����Ӱ�ɷ����޹�˾.�й�");
        driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
        driver.get("http://xn--chq4wn2dsxdruvkxks9xn2u284azzn.xn--fiqs8s/");
        driver.switchTo().frame("main");
        Thread.sleep(2000);
//        wait.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"companyNameBox\"]/p/em/a")," �����㰲�������޹�˾"));
        bannerCheck(driver);
    }

    /**
     *��12�����������Ƽ��ɷ����޹�˾�����������Ƽ��ɷ����޹�˾.�й�   �鿴ҳ���Ƿ���ʾ������ͨ���Ƿ���ʾ����
     * @throws InterruptedException
     */
    @Test
    public void gxOnlineCheckCase012() throws InterruptedException {
        Reporter.log("http://���������Ƽ��ɷ����޹�˾.�й�");
        driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
        driver.get("http://xn--doq22d28bpj133dchgsq9ayfiwlbc5f158f49a.xn--fiqs8s/");
        driver.switchTo().frame("main");
        Thread.sleep(2000);
//        wait.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"companyNameBox\"]/p/em/a")," �����㰲�������޹�˾"));
        bannerCheck(driver);
    }

    /**
     * ��13���������ػ����Ƽ����޹�˾���������ػ�������Ƽ����޹�˾.�й�    �鿴ҳ���Ƿ���ʾ������ͨ���Ƿ���ʾ����
     * @throws InterruptedException
     */
    @Test
    public void gxOnlineCheckCase013() throws InterruptedException {
        Reporter.log("http://�������ػ�������Ƽ����޹�˾.�й�");
        driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
        driver.get("http://xn--fiq8i81fc3c2l333etqas3yk67b3sk0gb12fx55h4gb.xn--fiqs8s/");
        driver.switchTo().frame("main");
        Thread.sleep(2000);
//        wait.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"companyNameBox\"]/p/em/a")," �����㰲�������޹�˾"));
        bannerCheck(driver);
    }

    /**
     * ��14����ҩ���Źɷ����޹�˾��	��ҩ���Źɷ����޹�˾.�й�     �鿴ҳ���Ƿ���ʾ����
     * @throws InterruptedException
     */
    @Test
    public void gxOnlineCheckCase014() throws InterruptedException {
        Reporter.log("http://��ҩ���Źɷ����޹�˾.�й�");
        driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
        driver.get("http://xn--doq22d51cg8dy70aqmbmw6gcye5r3cu7a.xn--fiqs8s/");
        driver.switchTo().frame("main");
        Thread.sleep(2000);
//        wait.until(ExpectedConditions.textToBe(By.className("cursor-default")," ��һ�ع��ɷ����޹�˾"));
        Assert.assertEquals(driver.findElement(By.className("cursor-default")).getText(),"��ҩ���Źɷ����޹�˾");
        Assert.assertEquals(driver.findElement(By.className("company-contact")).getText(),"�绰��0871-68319868 ���䣺office.kpc@holley.cn");
        Assert.assertEquals(driver.findElement(By.className("company-site")).getText(),"��ַ������ʡ�����и��¼�����ҵ��������ҽ·166��");
        Assert.assertEquals(driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/dl/dd[1]/ul/li[4]/div/a")).getText(),"http://www.kpc.com.cn");
    }

    /**
     * http://www.gxzg.org.cn      �鿴��ַ��ҳ��ʾ�Ƿ�����������ҵ������վ�����Ʒ�����Ƿ�������������ҳ�Ƿ���������ʾ
     * @throws InterruptedException
     */
    @Test
    public void gxOnlineCheckCase015() throws InterruptedException {
        Reporter.log("http://www.gxzg.org.cn");
        driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get("http://www.gxzg.org.cn");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/ul/li[2]/dl/dd/input")).click();
        driver.findElement(By.xpath("/html/body/ul/li[2]/dl/dd/input")).sendKeys("����");
        driver.findElement(By.xpath("/html/body/ul/li[2]/dl/dd/a")).click();
        WebDriverWait wait = new WebDriverWait(driver,10,1);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"searchCompanyLine\"]/li[1]/div[2]/h6/a[1]")));
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"searchCompanyLine\"]/li[1]/div[2]/h6/a[1]"))
                .getText(),"���������Ƽ����޹�˾");
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"searchCompanyLine\"]/li[2]/div[2]/h6/a[1]")).getText(),"���������Ƽ��ɷ����޹�˾");
        driver.findElement(By.xpath("/html/body/div[2]/ul/li[2]")).click();
        Thread.sleep(5000);
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"searchWebLine\"]/li[1]/div[2]/a")).getText(),"���������Ƽ��ɷ����޹�˾����");
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"searchWebLine\"]/li[1]/div[2]/div[2]/div/span[1]")).getText(),"���ù���");
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"searchWebLine\"]/li[1]/div[2]/div[2]/div/a")).getText(),"www.nawang.cn");
        driver.findElement(By.xpath("/html/body/div[2]/ul/li[3]")).click();
        Thread.sleep(5000);
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"6335\"]")).getAttribute("pname"),"���ù���-��ȫ�������Ĺ�������");
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"searchShopLine\"]/li[1]/div[2]/div[2]/span")).getText(),"���������Ƽ����޹�˾");
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"6336\"]")).getAttribute("pname"),"����ֱ��-��Ʒֱ����α");
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"searchShopLine\"]/li[2]/div[2]/div[2]/span")).getText(),"���������Ƽ����޹�˾");
    }

    /**
     * https://www.gxzg.org.cn      �鿴��ַ��ҳ��ʾ�Ƿ�����������ҵ������վ�����Ʒ�����Ƿ�������������ҳ�Ƿ���������ʾ
     * @throws InterruptedException
     */
    @Test
    public void gxOnlineCheckCase016() throws InterruptedException {
        Reporter.log("https://www.gxzg.org.cn");
        driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get("https://www.gxzg.org.cn");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/ul/li[2]/dl/dd/input")).click();
        driver.findElement(By.xpath("/html/body/ul/li[2]/dl/dd/input")).sendKeys("����");
        driver.findElement(By.xpath("/html/body/ul/li[2]/dl/dd/a")).click();
        WebDriverWait wait = new WebDriverWait(driver,10,1);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"searchCompanyLine\"]/li[1]/div[2]/h6/a[1]")));
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"searchCompanyLine\"]/li[1]/div[2]/h6/a[1]"))
                .getText(),"���������Ƽ����޹�˾");
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"searchCompanyLine\"]/li[2]/div[2]/h6/a[1]")).getText(),"���������Ƽ��ɷ����޹�˾");
        driver.findElement(By.xpath("/html/body/div[2]/ul/li[2]")).click();
        Thread.sleep(5000);
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"searchWebLine\"]/li[1]/div[2]/a")).getText(),"���������Ƽ��ɷ����޹�˾����");
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"searchWebLine\"]/li[1]/div[2]/div[2]/div/span[1]")).getText(),"���ù���");
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"searchWebLine\"]/li[1]/div[2]/div[2]/div/a")).getText(),"www.nawang.cn");
        driver.findElement(By.xpath("/html/body/div[2]/ul/li[3]")).click();
        Thread.sleep(5000);
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"6335\"]")).getAttribute("pname"),"���ù���-��ȫ�������Ĺ�������");
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"searchShopLine\"]/li[1]/div[2]/div[2]/span")).getText(),"���������Ƽ����޹�˾");
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"6336\"]")).getAttribute("pname"),"����ֱ��-��Ʒֱ����α");
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"searchShopLine\"]/li[2]/div[2]/div[2]/span")).getText(),"���������Ƽ����޹�˾");
    }
}