package org.prog;

public class SecondMain {

    public static void main(String[] args) {
        Car myCar = new Car();
        Car thatCar = myCar;
        Car redCar = myCar;

        CarService carService = new CarService();
        carService.paintCar(thatCar, "green");
        System.out.println(myCar.color);
        carService.paintCar(redCar, "red");
        System.out.println(myCar.color);

        int i = 10;
        smth(i);
        System.out.println(i);
    }

    public static void smth(int i){
        i += 100;
        System.out.println(i);
    }
}