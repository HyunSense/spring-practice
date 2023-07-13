package com.hyun.springprac;

import com.hyun.springprac.springbean.vehicle.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AppConfig {

    @Bean
    public Vehicle vehicle() {

        return new Car(vehiclePart(), vehicleKey());
    }

    @Bean
    public VehiclePart vehiclePart() {

        return new CarPart();
    }

    @Bean
    public VehicleKey vehicleKey() {

        return new CarKey();
    }
}
