package com.hyun.springprac.springbean.vehicle;

public class AirPlane implements Vehicle {

    private final VehiclePart vehiclePart;

    public AirPlane(VehiclePart vehiclePart) {
        this.vehiclePart = vehiclePart;
    }


    @Override
    public void start() {

        if (vehiclePart instanceof AirPlanePart) {
            System.out.println("AirPlane.start");
            return;
        }

        System.out.println("PartType is " + vehiclePart.getClass().getSimpleName());
        System.out.println("Can't Start");

    }

    @Override
    public void stop() {

        if (vehiclePart instanceof AirPlanePart) {
            System.out.println("AirPlane.stop");
            return;
        }

        System.out.println("PartType is " + vehiclePart.getClass().getSimpleName());
        System.out.println("Can't stop");
    }

}
