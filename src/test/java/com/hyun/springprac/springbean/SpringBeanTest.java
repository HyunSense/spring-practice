package com.hyun.springprac.springbean;

import com.hyun.springprac.AppConfig;
import com.hyun.springprac.springbean.vehicle.Vehicle;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringBeanTest {

//    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

    // ApplicationContext 에는 getDefinitionNames() 와같은 기능이 없다.
    AnnotationConfigApplicationContext applicationContext =
            new AnnotationConfigApplicationContext(AppConfig.class);


    @Test
    @DisplayName("모든 빈 출력")
    void findAllBean() {

        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            Object bean = applicationContext.getBean(beanDefinitionName);
            System.out.println("name = " + "["+ beanDefinitionName +"]" + " bean = " + "["+ bean +"]");
        }
    }

    @Test
    @DisplayName("Application Bean 출력")
    void findAppBean() {

        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            BeanDefinition beanDefinition = applicationContext.getBeanDefinition(beanDefinitionName);

            //ROLE_APPLICATION: 내가 등록한 Application 빈
            //ROLE_INFRASTRUCTURE: 스프링 내부에서 등록한 빈

            if (beanDefinition.getRole() == BeanDefinition.ROLE_APPLICATION) {
                Object bean = applicationContext.getBean(beanDefinitionName);
                System.out.println("name = " + "["+ beanDefinitionName +"]" + " bean = " + "["+ bean +"]");

            }

        }
    }

    @Test
    @DisplayName("잘못된 빈 이름으로 조회 할 경우")
    void findBeanByNameX() {
//        applicationContext.getBean("xxxxx", Vehicle.class);

        //assertJ의 assertThatThrownBy()
        Assertions.assertThatThrownBy(() -> applicationContext.getBean("xxxxx", Vehicle.class))
                .isInstanceOf(NoSuchBeanDefinitionException.class);

        //Junit의 assertThorws
//        Assertions.assertThrows(NoSuchBeanDefinitionException.class,
//                () -> applicationContext.getBean("xxxxx", Vehicle.class));
    }
}
