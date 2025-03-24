package org.prog;

public class CarRentService {

    public void rentCar(Car car, int miles) {
        car.milage += miles;
    }

    public void rantThatDoesntWork(int miles, int rentedMiles) {
        miles += rentedMiles;
    }
}
