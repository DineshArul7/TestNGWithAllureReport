package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGDemo {

    @Test
    public void demoTest(){
        System.out.println("Deekay");
        Assert.assertEquals(true,true);
    }

    @Test
    public void demo2Test(){
        System.out.println("Devil");
        Assert.assertEquals(true,true);
    }
}
