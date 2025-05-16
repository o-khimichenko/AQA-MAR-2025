package org.prog;

public class Main {

    public static void main(String[] args) {
        Car myCar = new Car();
        Car thatCar = new Car();


        myCar.owner = "George";
        thatCar.owner = "George";
        myCar.color = "red";
        thatCar.color = "red";

        System.out.println(myCar.equalsO(thatCar));
      ///  System.out.println("this will neve run");
    }
}
