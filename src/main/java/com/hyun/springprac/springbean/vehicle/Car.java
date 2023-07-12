package com.hyun.springprac.springbean.vehicle;

public class Car implements Vehicle {

    private final VehiclePart vehiclePart;

    public Car(VehiclePart vehiclePart) {
        this.vehiclePart = vehiclePart;
    }

    @Override
    public void start() {

        if (vehiclePart instanceof CarPart) {
            System.out.println("Car.start");
            return;
        }

        System.out.println("PartType is " + vehiclePart.getClass().getSimpleName());
        System.out.println("Can't Start");
    }

    @Override
    public void stop() {

        if (vehiclePart instanceof CarPart) {
            System.out.println("Car.stop");
            return;
        }

        System.out.println("PartType is " + vehiclePart.getClass().getSimpleName());
        System.out.println("Can't stop");


    }


}
