package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class TestNGDemo extends GeneralMethods{
WebDriver driver;
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Setting up Chrome");
        String pathofchrome=System.getProperty("user.dir")+"\\src\\test\\java\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",pathofchrome);
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("Opening Browser");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("Launching the web page");
        driver.get("https://the-internet.herokuapp.com");
    }

    @AfterClass
    public void afterClass(){
        driver.close();
    }

    @AfterTest
    public void afterTest(){
        System.out.println("After Test");
        driver.quit();
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("After Suite");
    }

    @Test
    public void Login(){
        driver.findElement(By.xpath("//a[text()='Form Authentication']")).click();
        driver.findElement((By.xpath("//input[@name='username']"))).sendKeys("tomsmith");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.xpath("//i[contains(text(),'Login')]")).click();
        System.out.println("Valdation of secure login");
        String msg=driver.findElement(By.cssSelector("#flash")).getText();
        msg=msg.split("!")[0];
        System.out.println(msg);
        Assert.assertEquals(msg,"You logged into a secure area");
        driver.findElement(By.xpath("//a[@class='button secondary radius']")).click();
        String logoutmsg=driver.findElement(By.cssSelector("#flash")).getText();
        logoutmsg=logoutmsg.split("!")[0];
        Assert.assertEquals(logoutmsg,"You logged out of the secure area");
        System.out.println(logoutmsg);

    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Sign In");

    }

    @AfterMethod
    public void AfterMethod(){
        System.out.println("After Method");

    }

}
