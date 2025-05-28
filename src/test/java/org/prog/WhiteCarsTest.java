package org.prog;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WhiteCarsTest extends ParentTest{
    @Test
    public void test() {System.out.println("Checking if there are any white cars...");}

    @Test(dataProvider = "colorData")
    public void whiteCarTest(String color){
        System.out.println("Checking the color of your car.... ");
        Assert.assertEquals(color, "white", "Your car is not white, it is " + color);
        System.out.println("Your car is white!");
    }
    @DataProvider
    public Object[][] colorData() {
        return new Object[][]{
                {"red"},
                {"green"},
                {"yellow"},
                {"white"},
                {"purple"}
        };
    }
}


