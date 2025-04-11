package org.prog;

import org.prog.poly.ICar;

import java.util.HashSet;
import java.util.Set;

//TODO: add owner to equals emthod and hascode method
public class Car implements ICar {

    public Integer fuelLevel;
    public Engine engine;
    public String color;
    public int milage;

//    public Set<String> drivers = new HashSet<>();

    public Car(){}

    public Car(String color){
        this.color = color;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Car) {
            Car c = (Car) obj;
            return this.color.equals(c.color);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.color.hashCode();
    }

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
