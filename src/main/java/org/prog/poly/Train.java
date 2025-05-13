package org.prog.poly;

public class Train implements ITransport {
    public Integer passengerCount=10;
    public void addPassengers() {
        passengerCount+=1;
        System.out.println("A passenger has been added to the train, total number of passengers: " + passengerCount);
    }

    @Override
    public void removePassengers() {
        passengerCount-=1;
        System.out.println("A passenger has been removed from the train, total number of passengers: " + passengerCount);
    }
}

