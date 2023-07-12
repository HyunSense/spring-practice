package com.hyun.springprac.springbean;

import com.hyun.springprac.AppConfig;
import com.hyun.springprac.springbean.vehicle.Vehicle;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringBeanSingletonTest {

    ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);


    @Test
    @DisplayName("스프링컨테이너 Singleton Test")
    void singletonTest() {

        Vehicle vehicle1 = ac.getBean("vehicle", Vehicle.class);
        Vehicle vehicle2 = ac.getBean("vehicle", Vehicle.class);

        //객체의 참조값을 직접 눈으로 확인 해보았다.
        System.out.println("vehicle1 = " + vehicle1);
        System.out.println("vehicle2 = " + vehicle2);

        //객체의 참조값이 같은지 확인
        Assertions.assertThat(vehicle1).isSameAs(vehicle2);

    }

}
