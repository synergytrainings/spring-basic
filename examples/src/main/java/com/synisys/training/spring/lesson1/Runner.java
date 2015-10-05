package com.synisys.training.spring.lesson1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Armen.Mkrtchyan.
 * @version 1.0
 * @since <pre>May 12, 2015</pre>
 */
public class Runner {

    private static final String outTemplate = "car's model is %s car's max speed is %.2f km/h" +
            System.getProperty("line.separator");

    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("classpath:com/synisys/training/spring/lesson1/springContext.xml");
        ApplicationContext javaAppContext = new AnnotationConfigApplicationContext(JavaConfiguration.class);
        Car simpleCar = applicationContext.getBean("simpleCar", Car.class);
        System.out.printf(outTemplate, simpleCar.model(), simpleCar.maxSpeed());
        Car fastCar = javaAppContext.getBean("fastCar", Car.class);
        System.out.printf(outTemplate, fastCar.model(), fastCar.maxSpeed());

    }

}
