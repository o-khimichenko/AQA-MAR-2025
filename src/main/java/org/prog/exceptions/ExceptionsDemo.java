package org.prog.exceptions;

import org.prog.Car;

import java.net.MalformedURLException;
import java.net.URL;

public class ExceptionsDemo {

    public static void main(String[] args) throws MalformedURLException {
        Car car = new Car();
        Car car2 = new Car();
        car.equals(car2);

        smth1("this is bad url");
        System.out.println("this will never run");
    }

    public static void smth1(String s) throws MalformedURLException {
        smth2(s);
    }

    public static void smth2(String s) throws MalformedURLException {
        smth3(s);
    }

    public static void smth3(String s) throws MalformedURLException {
        smth4(s);
    }

    public static void smth4(String s) throws MalformedURLException {
        URL url = new URL(s);
    }
}
