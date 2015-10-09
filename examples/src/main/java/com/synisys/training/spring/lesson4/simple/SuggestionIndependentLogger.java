package com.synisys.training.spring.lesson4.simple;

import org.aspectj.lang.JoinPoint;

/**
 * @author Armen.Mkrtchyan.
 * @version 1.0
 * @since <pre>Oct 09, 2015</pre>
 */
public class SuggestionIndependentLogger {

    public void log(JoinPoint joinPoint) {
        System.out.println("Executing: " +
                joinPoint.getSignature().getDeclaringTypeName() + " "
                + joinPoint.getSignature().getName());
    }
}
