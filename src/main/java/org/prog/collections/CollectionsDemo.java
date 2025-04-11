package org.prog.collections;

import org.prog.Car;

import java.util.*;
import java.util.stream.Collectors;

//TODO: Write collection where unique drivers own multiple cars
//TODO: fill owners and cars
//TODO: set car colors

//TODO: print all people who have white cars. If no white cars present - print "no white cars exist".

public class CollectionsDemo {

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("red"));
        cars.add(new Car("blue"));
        cars.add(new Car("red"));
        cars.add(new Car("green"));
        cars.add(new Car("red"));
        cars.add(new Car("yellow"));

//        String result = "";
//
//        for (Car c : cars) {
//            if (c.color.equals("red") || c.color.equals("yellow")) {
//                result += car.color + ",";
//            }
//        }
//        System.out.println(result);

        String result = cars.stream()
                .filter(c -> c.color.equals("red") || c.color.equals("yellow"))
                .map(c -> c.color)
                .collect(Collectors.joining(","));

        System.out.println(result);

    }

    public void optionOne() {
//        Car car1 = new Car();
//        Car car2 = new Car();
//        Car car3 = new Car();
//        Car car4 = new Car();
//        Car car5 = new Car();
//
//        car1.drivers.add("John");
//        car2.drivers.add("Jane");
//        car3.drivers.add("Steven");
//        car4.drivers.add("Bob");
//        car5.drivers.add("Alice");
//
//        List<Car> cars = new ArrayList<>();
//        cars.add(car1);
//        cars.add(car2);
//        cars.add(car3);
//        cars.add(car4);
//        cars.add(car5);
//
//        for (Car car : cars) {
//            if (car.drivers.contains("John")) {
//                System.out.println("This is John's car!");
//            }
//        }
    }
}
