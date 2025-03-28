package org.prog.poly;

public class BMW implements ICar {

    @Override
    public void turnLeft() {
        System.out.println("BMW turns left");
    }

    @Override
    public void turnRight() {
        System.out.println("BMW turns right");
    }
}
