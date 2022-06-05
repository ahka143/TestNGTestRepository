package tests;

import org.testng.annotations.Test;

import utilities.DriverCross;
import utilities.TestBaseCross;

public class C03_Priority extends TestBaseCross {
    @Test(priority = -5)
    public void amazonTesti() {
        DriverCross.getDriver("edge").get("https://www.amazon.com");
        System.out.println(driver.getCurrentUrl());

    }
    @Test(priority = -2)
    public void test02() {
        DriverCross.getDriver("edge").get("https://www.bestbuy.com");
        System.out.println(driver.getCurrentUrl());
    }
    @Test
    public void techproedtesti() {
        DriverCross.getDriver("edge").get("https://www.techproeducation.com");
        System.out.println(driver.getCurrentUrl());
    }
}
