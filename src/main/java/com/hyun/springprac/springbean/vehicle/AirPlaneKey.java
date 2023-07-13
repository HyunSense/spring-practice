package com.hyun.springprac.springbean.vehicle;

import org.springframework.stereotype.Component;

@Component
public class AirPlaneKey implements VehicleKey{
    @Override
    public void startKey() {
        System.out.println("AirPlaneKey.startKey");
    }
}
