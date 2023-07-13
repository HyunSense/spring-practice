package com.hyun.springprac.springbean.vehicle;

import org.springframework.stereotype.Component;

@Component
public class CarPart implements VehiclePart{
    @Override
    public void engine() {
        System.out.println("CarPart.engine");
    }

    @Override
    public void tire() {
        System.out.println("CarPart.tire");
    }

    @Override
    public void door() {
        System.out.println("CarPart.door");
    }
}
