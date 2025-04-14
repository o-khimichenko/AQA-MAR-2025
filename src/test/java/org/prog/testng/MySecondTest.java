package org.prog.testng;

import org.testng.annotations.Test;

public class MySecondTest extends ParentTest {

    @Test
    public void test() {
        System.out.println("Testing My Second");
    }
}
