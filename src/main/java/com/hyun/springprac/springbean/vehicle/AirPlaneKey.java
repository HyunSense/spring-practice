package com.hyun.springprac.springbean.vehicle;

public class AirPlaneKey implements VehicleKey{
    @Override
    public void startKey() {
        System.out.println("AirPlaneKey.startKey");
    }
}
