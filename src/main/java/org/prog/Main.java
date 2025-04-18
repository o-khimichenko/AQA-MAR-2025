package org.prog;

public class Main {

    public static void main(String[] args) {
        Car car = new Car();
        Car car2 = new Car();
        Car car3 = new Car();

        System.out.println(car.engine.timestamp);
        System.out.println(car2.engine.timestamp);
        System.out.println(car3.engine.timestamp);
    }
}
