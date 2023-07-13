package com.hyun.springprac.springbean;

import com.hyun.springprac.AppConfig;
import com.hyun.springprac.springbean.vehicle.*;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class MyVehicleTest {

    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);


    @Test
    @DisplayName("빈 등록 테스트")
    void vehicleTypeTest() {

        Vehicle vehicle = applicationContext.getBean("vehicle", Vehicle.class);

        Assertions.assertThat(vehicle).isInstanceOf(Car.class);



    }
}