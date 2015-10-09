package com.synisys.training.spring.lesson4.simple;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @author Armen.Mkrtchyan.
 * @version 1.0
 * @since <pre>Oct 09, 2015</pre>
 */
public class MessageDecorator implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.print("Hello ");
        Object retVal = invocation.proceed();
        System.out.println("!");
        return retVal;
    }
}
