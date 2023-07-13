# spring-practice

### 목표
- 순수 스프링의 원리 이해하기
- 순수 스프링을 사용하여 예제 만들어보기
- 스프링의 장점 알아보기         


---   


## 스프링컨테이너의 빈 조회 방법
```java
// AppConfig.class : 설정정보
ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

// 빈 이름, 빈 클래스로 출력
applicationcontext.getBean("beanName", beanClass);

//빈 이름으로 조회
applicationcontext.getBean("beanName");

//빈 클래스로 조회
applicationcontext.getBean(beanClass);
```


## Exception Test(Junit & AssertJ)
### 잘못된 빈 이름으로 조회하였을 경우


```java

//AssertJ(AssertJ의 Assertions), assertThatThrownBy 
Assertions.assertThatThrownBy(() -> applicationContext.getBean("xxxxx", Vehicle.class))
        .isInstanceOf(NoSuchBeanDefinitionException.class);

//Junit (Junit의 Assertions 주의), asserThrows
Assertions.assertThrows(NoSuchBeanDefinitionException.class,
                () -> applicationContext.getBean("xxxxx", Vehicle.class));
```
