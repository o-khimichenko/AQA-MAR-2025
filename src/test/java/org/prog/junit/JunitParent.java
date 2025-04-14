package org.prog.junit;

import org.junit.jupiter.api.BeforeAll;

public class JunitParent {

    @BeforeAll
    public static void setUp(){
        System.out.println("=======START=========");
    }
}
