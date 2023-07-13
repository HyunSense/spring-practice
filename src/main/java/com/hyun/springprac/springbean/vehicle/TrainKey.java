package com.hyun.springprac.springbean.vehicle;

public class TrainKey implements VehicleKey{
    @Override
    public void startKey() {
        System.out.println("TrainKey.startKey");
    }
}
