package org.prog.inheritance;

public class BigCargoTruck extends CargoTruck {

    public void addHugeCargo() {
        smth();
    }

    @Override
    public void turnLeft() {
        System.out.println("Big cars turn left in a different way");
    }

    @Override
    public void turnRight() {
        System.out.println("Big cars turn right in a different way");
    }
}
