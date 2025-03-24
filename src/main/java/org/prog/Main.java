package org.prog;

public class Main {

    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();

        CarService carService = new CarService();
        CarRentService carRentService = new CarRentService();

        car1.color = "red";
        car2.color = "blue";
        car3.color = "green";

        car1.milage = 10;

        carRentService.rantThatDoesntWork(car1.milage, 20000);
        System.out.println("car1 milage " + car1.milage);

        carRentService.rentCar(car1, 200);
        System.out.println("car1 milage " + car1.milage);

//        car1.goTo("Kyiv");
//        car2.goTo("Odessa");
//        car3.goTo("Warsaw");
//
//        carService.paintCar(car1, "yellow");
//        carService.paintCar(car2, "purple");
//        carService.paintCar(car3, "black");
//
//        car1.goTo("Lviv");
//        car2.goTo("Lviv");
//        car3.goTo("Lviv");
    }
}
