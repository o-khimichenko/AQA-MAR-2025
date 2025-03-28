package org.prog;

import org.prog.poly.ICar;

/**
 * CAR > PICKUP > CARGO_TRUCK > BIG_TRUCK > VERY_BIG_TRUCK
 * ICAR ......................> OVERRIDE > ............
 */


public class Car implements ICar {

    public Integer fuelLevel;
    public Engine engine;
    public String color;
    public int milage;

    public void goTo(String destination) {
        goTo(destination, "nowhere");
    }

    public void goTo(String destination, String from) {
        goTo(destination, from, "nowhere");
    }

    public void goTo(String destination, String from, String stoppingAt) {
        fuelCar();
        startEngine();
        fuelLevel -= 20;
        System.out.println("car goes from " + from + " to " + destination + "  stopping at " + stoppingAt);
    }

    protected void smth() {
        System.out.println("smth");
    }

    private void startEngine() {
        fuelLevel -= 1;
        System.out.println("Starting engine...");
    }

    private void fuelCar() {
        fuelLevel = 100;
        System.out.println("Fuel car...");
    }

    @Override
    public void turnLeft() {
        System.out.println("Car turns left");
    }

    @Override
    public void turnRight() {
        System.out.println("Car turns right");
    }
}
