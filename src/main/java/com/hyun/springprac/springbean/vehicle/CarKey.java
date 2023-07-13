package com.hyun.springprac.springbean.vehicle;

public class CarKey implements VehicleKey {
    @Override
    public void startKey() {
        System.out.println("CarKey.startKey");
    }
}
