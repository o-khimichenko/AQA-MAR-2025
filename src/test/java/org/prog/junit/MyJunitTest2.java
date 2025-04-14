package org.prog.junit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class MyJunitTest2 extends JunitParent {

    @ParameterizedTest
    @MethodSource("firstTest2")
    public void firstTest1(String value, String expected) {
        System.out.println("Hello " + value + " " + expected);
    }

    public static Stream<Arguments> firstTest2() {
        System.out.println("do something");
        //HERE
        return Stream.of(
                Arguments.of("value1", "expected1"),
                Arguments.of("value2", "expected2"),
                Arguments.of("value3", "expected3"),
                Arguments.of("value4", "expected4"),
                Arguments.of("value5", "expected5")
        );
    }
}
/*
    1. Test123!

    1. Test1234, missing spec symbol
    2. test123!, missing capital letter
    3. Testtest!, missing digits
    4. Test12!, password too short

 */