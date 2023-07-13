# TEST (Junit5 feat.assertJ)
---
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
