package com.hyun.springprac.springbean.vehicle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AirPlane implements Vehicle {

    private final VehiclePart vehiclePart;
    private final VehicleKey vehicleKey;

    /**
     * @Bean
     * Vehicle vehicle(){ //아래의 생성자를 통해 @Bean에 주입이 되는 것을 @Component 와 @Autowired가 대신처리
     *     return new AirPlace(new AirPlacePart(), new AirPlaceKey());
     * }
     */

    @Autowired
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
