package org.prog.demos;

import org.prog.Car;
import org.prog.inheritance.BigCargoTruck;
import org.prog.inheritance.CargoTruck;
import org.prog.inheritance.PickupTruck;

public class InheritanceDemo {

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.goTo("Kyiv");

        PickupTruck pickupTruck = new PickupTruck();
        pickupTruck.goTo("Lviv");

        CargoTruck cargoTruck = new CargoTruck();
        cargoTruck.goTo("Kharkiv");

        BigCargoTruck bigCargoTruck = new BigCargoTruck();
        bigCargoTruck.goTo("Odessa");
    }
}
