package com.synisys.training.spring.lesson1;

import com.synisys.training.spring.lesson1.Bugatti;
import com.synisys.training.spring.lesson1.Car;
import com.synisys.training.spring.lesson1.Pagani;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Armen.Mkrtchyan.
 * @version 1.0
 * @since <pre>Oct 06, 2015</pre>
 */
@Configuration
public class JavaConfiguration {

    @Bean(name = "simpleCar")
    public Car getSimpleCar() {
        return new Pagani();
    }

    @Bean(name = "fastCar")
    public Car getFastCar() {
        return new Bugatti();
    }

}
