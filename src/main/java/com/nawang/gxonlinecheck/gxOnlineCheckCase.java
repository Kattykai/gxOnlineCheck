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
     * （1）上海汽车集团股份有限公司：上海汽车集团股份有限公司.中国   查看页面是否显示正常
     * @throws InterruptedException
     */
    @Test
    public void gxOnlineCheckCase001() throws InterruptedException {
        Reporter.log("http://上海汽车集团股份有限公司.中国");
        driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
        driver.get("http://xn--fhqywn2dsxdr4e505aexie2bv31fi44ao5pljb.xn--fiqs8s/");
        driver.switchTo().frame("main");
        Thread.sleep(2000);
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.textToBe(By.xpath("/html/body/div[2]/div/div[1]/dl/dd[1]/ul/li[1]/h2/a"),"上海汽车集团股份有限公司"));
        Assert.assertEquals(driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/dl/dd[1]/ul/li[1]/h2/a")).getText(), "上海汽车集团股份有限公司");
        Assert.assertEquals(driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/dl/dd[1]/ul/li[2]/span[1]")).getText(), "电话：021-22011888");
        Assert.assertEquals(driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/dl/dd[1]/ul/li[2]/span[2]")).getText(), "邮箱：saicmotor@saicmotor.com");
        Assert.assertEquals(driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/dl/dd[1]/ul/li[3]/span")).getText(), "地址：中国（上海）自由贸易试验区松涛路563号1号楼509室");
        Assert.assertEquals(driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/dl/dd[1]/ul/li[4]/div/a")).getText(), "http://www.saicmotor.com");
    }

    /**
     * (2)哈药集团有限公司：哈药集团有限公司.中国  查看页面是否显示正常、通栏是否显示正常
     * @throws InterruptedException
     */
    @Test
    public void gxOnlineCheckCase002() throws InterruptedException {
        Reporter.log("http://哈药集团有限公司.中国");
        driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
        driver.get("http://xn--55qx5d1ri1ez65ai42bxv1a50a.xn--fiqs8s/");
        driver.switchTo().frame("main");
        Thread.sleep(2000);
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"companyNameBox\"]/p/em/a"),"哈药集团有限公司"));
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"companyNameBox\"]/p/em/a")).getText(),"哈药集团有限公司");
        bannerCheck(driver);
    }

    /**
     * （3）tcl集团股份有限公司：	tcl集团股份有限公司.中国                    查看页面是否显示正常
     * @throws InterruptedException
     */
    @Test
    public void gxOnlineCheckCase003() throws InterruptedException {
        Reporter.log("http://tcl集团股份有限公司.中国");
        driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
        driver.get("http://xn--tcl-pv9d94i15eergg72b0e2ccl5b7bb.xn--fiqs8s/");
        driver.switchTo().frame("main");
        Thread.sleep(2000);
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.textToBe(By.className("cursor-default"),"TCL集团股份有限公司"));
        Assert.assertEquals(driver.findElement(By.className("cursor-default")).getText(),"TCL集团股份有限公司");
        Assert.assertEquals(driver.findElement(By.className("company-contact")).getText(),"电话：0752-2288333 邮箱：-");
        Assert.assertEquals(driver.findElement(By.className("company-site")).getText(),"地址：广东省惠州市仲恺高新技术开发区十九号小区");
        Assert.assertEquals(driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/dl/dd[1]/ul/li[4]/div/a")).getText(),"http://www.tcl.com");
    }

    /**
     * （4）农夫山泉股份有限公司：			农夫山泉股份有限公司.中国   查看页面是否显示正常、通栏是否显示正常
     * @throws InterruptedException
     */
    @Test
    public void gxOnlineCheckCase004() throws InterruptedException {
        Reporter.log("http://农夫山泉股份有限公司.中国");
        driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
        driver.get("http://xn--doq22dces0hctjx9epowoqkk48bcl7b.xn--fiqs8s/");
        driver.switchTo().frame("main");
        Thread.sleep(2000);
//        wait.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"companyNameBox\"]/p/em/a")," 农夫山泉股份有限公司"));
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"companyNameBox\"]/p/em/a")).getText(),"农夫山泉股份有限公司");
        bannerCheck(driver);
    }

    /**
     *
     * （5）三一重工股份有限公司：	三一重工股份有限公司.中国                   查看页面是否显示正常
     * @throws InterruptedException
     */
    @Test
    public void gxOnlineCheckCase005() throws InterruptedException {
        Reporter.log("http://三一重工股份有限公司.中国");
        driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
        driver.get("http://xn--4gqra74eh5efrespub8otj2cmk6aepj.xn--fiqs8s/");
        driver.switchTo().frame("main");
        Thread.sleep(2000);
//        wait.until(ExpectedConditions.textToBe(By.className("cursor-default")," 三一重工股份有限公司"));
        Assert.assertEquals(driver.findElement(By.className("cursor-default")).getText(),"三一重工股份有限公司");
        Assert.assertEquals(driver.findElement(By.className("company-contact")).getText(),"电话：010-60738888 邮箱：sanyir@sany.com.cn");
        Assert.assertEquals(driver.findElement(By.className("company-site")).getText(),"地址：北京市昌平区北清路8号6幢5楼");
        Assert.assertEquals(driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/dl/dd[1]/ul/li[4]/div/a")).getText(),"http://www.sanyhi.com");
    }

    /**
     * （6）福建恒安集团有限公司：	福建恒安集团有限公司.中国   查看页面是否显示正常、通栏是否显示正常
     * @throws InterruptedException
     */
    @Test
    public void gxOnlineCheckCase006() throws InterruptedException {
        Reporter.log("http://附件恒安集团有限公司.中国");
        driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
        driver.get("http://xn--55qx5d59cd2g33e89b4ut079a8c6cw7a.xn--fiqs8s/");
        driver.switchTo().frame("main");
        Thread.sleep(2000);
//        wait.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"companyNameBox\"]/p/em/a")," 福建恒安集团有限公司"));
        bannerCheck(driver);
    }

    /**
     * （7）青岛海尔股份有限公司：	青岛海尔股份有限公司.中国    查看页面是否显示正常
     * @throws InterruptedException
     */
    @Test
    public void gxOnlineCheckCase007() throws InterruptedException {
        Reporter.log("http://青岛海尔股份有限公司.中国");
        driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
        driver.get("http://xn--doq22d51cg7mjtaw41cetkot2bq13bsdc.xn--fiqs8s/");
        driver.switchTo().frame("main");
        Thread.sleep(2000);
//        wait.until(ExpectedConditions.textToBe(By.className("cursor-default")," 三一重工股份有限公司"));
        Assert.assertEquals(driver.findElement(By.className("cursor-default")).getText(),"青岛海尔股份有限公司");
        Assert.assertEquals(driver.findElement(By.className("company-contact")).getText(),"电话：0532-86762198 邮箱：liuxiaol@haier.com");
        Assert.assertEquals(driver.findElement(By.className("company-site")).getText(),"地址：青岛市崂山区海尔工业园内");
        Assert.assertEquals(driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/dl/dd[1]/ul/li[4]/div/a")).getText(),"http://www.linkcook.cn");
    }

    /**
     * （8）万科企业股份有限公司：			万科企业股份有限公司.中国   查看页面是否显示正常、通栏是否显示正常
     * @throws InterruptedException
     */
    @Test
    public void gxOnlineCheckCase008() throws InterruptedException {
        Reporter.log("http://万科企业股份有限公司.中国");
        driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
        driver.get("http://xn--chqrbv8boa112a15ef47b4n5as2mcf5c.xn--fiqs8s/");
        driver.switchTo().frame("main");
        Thread.sleep(2000);
//        wait.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"companyNameBox\"]/p/em/a")," 福建恒安集团有限公司"));
        bannerCheck(driver);
    }

    /**
     *（9）华为技术有限公司：华为技术有限公司.中国    查看页面是否显示正常、通栏是否显示正常
     * @throws InterruptedException
     */
    @Test
    public void gxOnlineCheckCase009() throws InterruptedException {
        Reporter.log("http://华为技术有限公司.中国");
        driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
        driver.get("http://xn--siqt1fjybrtt77cbhguh7065a.xn--fiqs8s/");
        driver.switchTo().frame("main");
        Thread.sleep(2000);
//        wait.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"companyNameBox\"]/p/em/a")," 福建恒安集团有限公司"));
        bannerCheck(driver);
    }

    /**
     * （10）北京百度网讯科技有限公司：	北京百度网讯科技有限公司.中国   查看页面是否显示正常、通栏是否显示正常
     * @throws InterruptedException
     */
    @Test
    public void gxOnlineCheckCase010() throws InterruptedException {
        Reporter.log("http://背景百度网讯科技有限公司.中国");
        driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
        driver.get("http://xn--1lqw0etvb1zas40bbtfh6inn7a4igjyob96a9w0a.xn--fiqs8s/");
        driver.switchTo().frame("main");
        Thread.sleep(2000);
//        wait.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"companyNameBox\"]/p/em/a")," 福建恒安集团有限公司"));
        bannerCheck(driver);
    }

    /**
     * （11）万达电影股份有限公司：	万达电影股份有限公司.中国     查看页面是否显示正常、通栏是否显示正常
     * @throws InterruptedException
     */
    @Test
    public void gxOnlineCheckCase011() throws InterruptedException {
        Reporter.log("http://万达电影股份有限公司.中国");
        driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
        driver.get("http://xn--chq4wn2dsxdruvkxks9xn2u284azzn.xn--fiqs8s/");
        driver.switchTo().frame("main");
        Thread.sleep(2000);
//        wait.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"companyNameBox\"]/p/em/a")," 福建恒安集团有限公司"));
        bannerCheck(driver);
    }

    /**
     *（12）厦门纳网科技股份有限公司：厦门纳网科技股份有限公司.中国   查看页面是否显示正常、通栏是否显示正常
     * @throws InterruptedException
     */
    @Test
    public void gxOnlineCheckCase012() throws InterruptedException {
        Reporter.log("http://厦门纳网科技股份有限公司.中国");
        driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
        driver.get("http://xn--doq22d28bpj133dchgsq9ayfiwlbc5f158f49a.xn--fiqs8s/");
        driver.switchTo().frame("main");
        Thread.sleep(2000);
//        wait.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"companyNameBox\"]/p/em/a")," 福建恒安集团有限公司"));
        bannerCheck(driver);
    }

    /**
     * （13）厦门中拓互联科技有限公司：厦门中拓互联网络科技有限公司.中国    查看页面是否显示正常、通栏是否显示正常
     * @throws InterruptedException
     */
    @Test
    public void gxOnlineCheckCase013() throws InterruptedException {
        Reporter.log("http://厦门中拓互联网络科技有限公司.中国");
        driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
        driver.get("http://xn--fiq8i81fc3c2l333etqas3yk67b3sk0gb12fx55h4gb.xn--fiqs8s/");
        driver.switchTo().frame("main");
        Thread.sleep(2000);
//        wait.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"companyNameBox\"]/p/em/a")," 福建恒安集团有限公司"));
        bannerCheck(driver);
    }

    /**
     * （14）昆药集团股份有限公司：	昆药集团股份有限公司.中国     查看页面是否显示正常
     * @throws InterruptedException
     */
    @Test
    public void gxOnlineCheckCase014() throws InterruptedException {
        Reporter.log("http://昆药集团股份有限公司.中国");
        driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
        driver.get("http://xn--doq22d51cg8dy70aqmbmw6gcye5r3cu7a.xn--fiqs8s/");
        driver.switchTo().frame("main");
        Thread.sleep(2000);
//        wait.until(ExpectedConditions.textToBe(By.className("cursor-default")," 三一重工股份有限公司"));
        Assert.assertEquals(driver.findElement(By.className("cursor-default")).getText(),"昆药集团股份有限公司");
        Assert.assertEquals(driver.findElement(By.className("company-contact")).getText(),"电话：0871-68319868 邮箱：office.kpc@holley.cn");
        Assert.assertEquals(driver.findElement(By.className("company-site")).getText(),"地址：云南省昆明市高新技术产业开发区科医路166号");
        Assert.assertEquals(driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/dl/dd[1]/ul/li[4]/div/a")).getText(),"http://www.kpc.com.cn");
    }

    /**
     * http://www.gxzg.org.cn      查看网址首页显示是否正常，查企业、查网站、查产品功能是否正常、各详情页是否能正常显示
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
        driver.findElement(By.xpath("/html/body/ul/li[2]/dl/dd/input")).sendKeys("纳网");
        driver.findElement(By.xpath("/html/body/ul/li[2]/dl/dd/a")).click();
        WebDriverWait wait = new WebDriverWait(driver,10,1);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"searchCompanyLine\"]/li[1]/div[2]/h6/a[1]")));
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"searchCompanyLine\"]/li[1]/div[2]/h6/a[1]"))
                .getText(),"北京纳网科技有限公司");
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"searchCompanyLine\"]/li[2]/div[2]/h6/a[1]")).getText(),"厦门纳网科技股份有限公司");
        driver.findElement(By.xpath("/html/body/div[2]/ul/li[2]")).click();
        Thread.sleep(5000);
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"searchWebLine\"]/li[1]/div[2]/a")).getText(),"厦门纳网科技股份有限公司官网");
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"searchWebLine\"]/li[1]/div[2]/div[2]/div/span[1]")).getText(),"信用官网");
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"searchWebLine\"]/li[1]/div[2]/div[2]/div/a")).getText(),"www.nawang.cn");
        driver.findElement(By.xpath("/html/body/div[2]/ul/li[3]")).click();
        Thread.sleep(5000);
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"6335\"]")).getAttribute("pname"),"信用官网-安全可信赖的官网形象");
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"searchShopLine\"]/li[1]/div[2]/div[2]/span")).getText(),"北京纳网科技有限公司");
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"6336\"]")).getAttribute("pname"),"信用直购-商品直购辨伪");
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"searchShopLine\"]/li[2]/div[2]/div[2]/span")).getText(),"北京纳网科技有限公司");
    }

    /**
     * https://www.gxzg.org.cn      查看网址首页显示是否正常，查企业、查网站、查产品功能是否正常、各详情页是否能正常显示
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
        driver.findElement(By.xpath("/html/body/ul/li[2]/dl/dd/input")).sendKeys("纳网");
        driver.findElement(By.xpath("/html/body/ul/li[2]/dl/dd/a")).click();
        WebDriverWait wait = new WebDriverWait(driver,10,1);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"searchCompanyLine\"]/li[1]/div[2]/h6/a[1]")));
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"searchCompanyLine\"]/li[1]/div[2]/h6/a[1]"))
                .getText(),"北京纳网科技有限公司");
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"searchCompanyLine\"]/li[2]/div[2]/h6/a[1]")).getText(),"厦门纳网科技股份有限公司");
        driver.findElement(By.xpath("/html/body/div[2]/ul/li[2]")).click();
        Thread.sleep(5000);
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"searchWebLine\"]/li[1]/div[2]/a")).getText(),"厦门纳网科技股份有限公司官网");
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"searchWebLine\"]/li[1]/div[2]/div[2]/div/span[1]")).getText(),"信用官网");
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"searchWebLine\"]/li[1]/div[2]/div[2]/div/a")).getText(),"www.nawang.cn");
        driver.findElement(By.xpath("/html/body/div[2]/ul/li[3]")).click();
        Thread.sleep(5000);
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"6335\"]")).getAttribute("pname"),"信用官网-安全可信赖的官网形象");
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"searchShopLine\"]/li[1]/div[2]/div[2]/span")).getText(),"北京纳网科技有限公司");
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"6336\"]")).getAttribute("pname"),"信用直购-商品直购辨伪");
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"searchShopLine\"]/li[2]/div[2]/div[2]/span")).getText(),"北京纳网科技有限公司");
    }
}