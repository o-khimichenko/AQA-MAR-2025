package org.prog.staticdemo;

public class StaticDemo {

    public static void main(String[] args) {
        StaticExample staticExample = new StaticExample();
        staticExample.nonStaticString = "a";
        System.out.println(StaticExample.PI);

        System.out.println(Math.abs(-10));
    }
}
