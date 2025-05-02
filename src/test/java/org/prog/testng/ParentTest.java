package org.prog.testng;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class ParentTest {

    @BeforeSuite
    public void setUp() {
        System.out.println("Run before all tests");
    }

    @AfterSuite
    public void tearDown() {
        System.out.println("Run after all tests");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Set up DB for test module...");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("Clear DB after test module...");
    }
}
