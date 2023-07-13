package com.hyun.springprac.springbean.vehicle;

import org.springframework.stereotype.Component;

//@Component
public class TrainKey implements VehicleKey{
    @Override
    public void startKey() {
        System.out.println("TrainKey.startKey");
    }
}
