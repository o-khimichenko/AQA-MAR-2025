package org.prog.collections;

import org.prog.Car;
import java.util.*;

//TODO: Write collection where unique drivers own multiple cars
//TODO: fill owners and cars
//TODO: set car colors

//TODO: print all people who have white cars. If no white cars present - print "no white cars exist".

public class CollectionsDemo {

    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        Car car4 = new Car();
        Car car5 = new Car();
        Car car6 = new Car();


        car1.color = "red";
        car2.color = "blue";
        car3.color = "green";
        car4.color = "white";
        car5.color = "white";
        car6.color = "orange";

        car1.carDriver = "John";
        car2.carDriver = "John";
        car3.carDriver = "Jane";
        car4.carDriver = "Jane";
        car5.carDriver = "Jack";
        car6.carDriver = "Jack";

        Map<String, List<Car>> driverOfCars = new HashMap<>();

        List<Car> johnCars = new ArrayList<>();
        johnCars.add(car1);
        johnCars.add(car2);
        driverOfCars.put("John", johnCars);


        List<Car> janeCars = new ArrayList<>();
        janeCars.add(car3);
        janeCars.add(car4);
        driverOfCars.put("Jane", janeCars);

        List<Car> jackCars = new ArrayList<>();
        jackCars.add(car5);
        jackCars.add(car6);
        driverOfCars.put("Jack", jackCars);


        boolean carIsWhite = false;
        List<String> whiteCarOwners = new ArrayList<>();
        for (String driver : driverOfCars.keySet()) {
            List<Car> cars = driverOfCars.get(driver);
            for (Car car : cars) {
                if (car.color.equals("white")) {
                    carIsWhite = true;
                    if (!whiteCarOwners.contains(driver)) {
                        whiteCarOwners.add(driver);
                    }
                    break;
                }
            }
        }


        if (carIsWhite) {
            System.out.println("People with white cars: " + whiteCarOwners);
        } else {
            System.out.println("no white cars exist");
        }
    }
}
//}
//        Map<Car, String> carsWithDrivers = new HashMap<>();
//        carsWithDrivers.put(car1, "John");
//        carsWithDrivers.put(car2, "Jane");
//        carsWithDrivers.put(car3, "Jack");
//
//        System.out.println(carsWithDrivers.get(car1));
//
//        Map<Car, Set<String>> carsWithDrivers2 = new HashMap<>();
//        carsWithDrivers2.put(car1, new HashSet<>());
//        carsWithDrivers2.put(car2, new HashSet<>());
//        carsWithDrivers2.put(car3, new HashSet<>());
//
//        carsWithDrivers2.get(car1).add("John");
//        carsWithDrivers2.get(car1).add("Jane");
//
//        carsWithDrivers2.get(car2).add("Jack");
//        carsWithDrivers2.get(car2).add("Jane");
//
//        carsWithDrivers2.get(car3).add("Jack");
//        carsWithDrivers2.get(car3).add("John");




//    public void optionOne() {
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
//    }





