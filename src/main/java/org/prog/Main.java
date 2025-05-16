package org.prog;

public class Main {

    public static void main(String[] args) {
        Car myCar = new Car();
        Car thatCar = new Car();


        myCar.owner = "Paul";
        thatCar.owner = "George";
        myCar.color = "red";
        thatCar.color = "red";

      //  System.out.println(myCar.equals(thatCar));
        System.out.println(myCar.equalsOwner(thatCar));
        System.out.println(myCar.ownerHash());
        System.out.println(thatCar.ownerHash());
      //  System.out.println("this will neve run");
    }
}
