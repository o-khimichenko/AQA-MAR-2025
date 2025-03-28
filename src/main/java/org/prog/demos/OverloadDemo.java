package org.prog.demos;

import org.prog.Car;

public class OverloadDemo {

    public static void main(String[] args) {
        Car car = new Car();
        car.goTo("Kyiv");
        car.goTo("Lviv", "Kyiv");
        car.goTo("Kharkiv", "Lviv", "Kyiv");
    }
}
