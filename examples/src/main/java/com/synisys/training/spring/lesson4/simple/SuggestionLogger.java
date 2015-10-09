package com.synisys.training.spring.lesson4.simple;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author Armen.Mkrtchyan.
 * @version 1.0
 * @since <pre>Oct 09, 2015</pre>
 */
public class SuggestionLogger implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        if (method.getName().equals("suggest")) {
            //System.out.println("suggesting for " + args[0]);
        }
    }
}
