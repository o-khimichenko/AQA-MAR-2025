package org.prog.poly;

public class Ford implements ICar {
    @Override
    public void turnLeft() {
        System.out.println("Ford turns left");
    }

    @Override
    public void turnRight() {
        System.out.println("Ford turns right");
    }
}
