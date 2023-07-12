package com.hyun.springprac.springbean.vehicle;

public class Train implements Vehicle {

    private final VehiclePart vehiclePart;

    public Train(VehiclePart vehiclePart) {
        this.vehiclePart = vehiclePart;
    }

    @Override
    public void start() {

        if (vehiclePart instanceof TrainPart) {
            System.out.println("Train.start");
            return;
        }

        System.out.println("PartType is " + vehiclePart.getClass().getSimpleName());
        System.out.println("Can't Start");
    }

    @Override
    public void stop() {

        if (vehiclePart instanceof TrainPart) {
            System.out.println("Train.stop");
            return;
        }

        System.out.println("PartType is " + vehiclePart.getClass().getSimpleName());
        System.out.println("Can't stop");
    }

}
