package org.prog.demos;

import org.prog.Car;
import org.prog.inheritance.BigCargoTruck;
import org.prog.inheritance.VeryBigCargoTruck;
import org.prog.poly.*;

public class PolyDemo {

    public static void main(String[] args) {
        Car car = new Car();
        BigCargoTruck bigCargoTruck = new BigCargoTruck();
        VeryBigCargoTruck veryBigCargoTruck = new VeryBigCargoTruck();
        BMW bmw = new BMW();
        Ford ford = new Ford();
        Mazda mazda = new Mazda();

Bus bus = new Bus();
Boat boat = new Boat();
Train train = new Train();
bus.addPassengers();
bus.addPassengers();
boat.removePassengers();
train.removePassengers();
train.removePassengers();
        driveSomewhere(bmw);
        driveSomewhere(ford);
        driveSomewhere(mazda);
        driveSomewhere(car);
        driveSomewhere(bigCargoTruck);
        driveSomewhere(veryBigCargoTruck);
    }

    public static void driveSomewhere(ICar iCar) {
        iCar.turnLeft();
        iCar.turnLeft();
        iCar.turnRight();
        iCar.turnRight();
    }

}
