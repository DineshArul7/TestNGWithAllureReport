package org.example;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest extends GeneralMethods{
    /**
     * Rigorous Test :-)
     */

    @BeforeTest
    public void fun(){
        System.out.println("No");
    }

    @Test(priority = 0)
    public void demo1(){
        System.out.println("app test method");
        String pathofchrome=System.getProperty("user.dir")+"\\src\\test\\java\\resources\\chromedriver.exe";
        System.out.println(System.getProperty("user.dir"));
        System.out.println(pathofchrome);
    }

    @Test(priority = 1)
    public void devil(){
        System.out.println("2");
    }

    @Test(priority = 2)
    public void akshaya(){
        System.out.println("3");
    }

    @Test(priority = 3)
    public void dheeksha(){
        System.out.println("4");
    }
}
