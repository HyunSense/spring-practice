package com.hyun.springprac.springbean.vehicle;

public class AirPlane implements Vehicle {

    private final VehiclePart vehiclePart;
    private final VehicleKey vehicleKey;

    public AirPlane(VehiclePart vehiclePart, VehicleKey vehicleKey) {
        this.vehiclePart = vehiclePart;
        this.vehicleKey = vehicleKey;
    }

    @Override
    public void start() {

        if (vehiclePart instanceof AirPlanePart && vehicleKey instanceof AirPlaneKey) {
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
