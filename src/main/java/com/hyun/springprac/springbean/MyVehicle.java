package com.hyun.springprac.springbean;

import com.hyun.springprac.AppConfig;
import com.hyun.springprac.springbean.vehicle.Vehicle;
import com.hyun.springprac.springbean.vehicle.VehiclePart;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyVehicle {


    public static void main(String[] args) {
//        AppConfig appConfig = new AppConfig();
//        Vehicle car = appConfig.vehicle();

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        Vehicle car = applicationContext.getBean("vehicle", Vehicle.class);

        System.out.println("---- MY VEHICLE: " + car.getClass().getSimpleName() + "----");
        car.start();
        car.stop();

    }



}
