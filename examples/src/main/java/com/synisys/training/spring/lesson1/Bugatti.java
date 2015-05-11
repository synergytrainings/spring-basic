package com.synisys.training.spring.lesson1;

/**
 * @author Armen.Mkrtchyan.
 * @version 1.0
 * @since <pre>May 12, 2015</pre>
 */
public class Bugatti implements Car {
    public String model() {
        return "Bugatti Veyron";
    }

    public double maxSpeed() {
        return 407.16;
    }
}
