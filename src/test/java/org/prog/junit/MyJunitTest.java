package org.prog.junit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MyJunitTest extends JunitParent{
    @BeforeEach
    public void before(){
        System.out.println("--------------------------");
    }

    @AfterAll
    public static void tearDown(){
        System.out.println("===========END=========");
    }

    @Test
    public void firstTest1(){
        System.out.println("Hello JUnit!");
    }

    @Test
    public void firstTest2(){
        System.out.println("Hello JUnit!");
    }

    @Test
    public void firstTest3(){
        System.out.println("Hello JUnit!");
    }

    @Test
    public void firstTest4(){
        System.out.println("Hello JUnit!");
    }

    @Test
    public void firstTest5(){
        System.out.println("Hello JUnit!");
    }
}
