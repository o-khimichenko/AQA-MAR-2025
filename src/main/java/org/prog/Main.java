package org.prog;

public class Main {

    public static void main(String[] args) {
        Car myCar = new Car();
        Car thatCar = new Car();

        myCar.equals(thatCar);

        myCar.color = "red";
        thatCar.color = "blue";

        System.out.println("this will neve run");
    }
}
