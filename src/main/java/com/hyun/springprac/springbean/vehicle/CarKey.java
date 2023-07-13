package com.hyun.springprac.springbean.vehicle;

import org.springframework.stereotype.Component;

@Component
public class CarKey implements VehicleKey {
    @Override
    public void startKey() {
        System.out.println("CarKey.startKey");
    }
}
