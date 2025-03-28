package org.prog.poly;

public class Mazda implements ICar {
    @Override
    public void turnLeft() {
        System.out.println("Mazda turns left");
    }

    @Override
    public void turnRight() {
        System.out.println("Mazda turns right");
    }
}
