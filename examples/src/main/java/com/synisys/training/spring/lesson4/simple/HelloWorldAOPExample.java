package com.synisys.training.spring.lesson4.simple;

import org.springframework.aop.framework.ProxyFactory;

/**
 * @author Armen.Mkrtchyan.
 * @version 1.0
 * @since <pre>Oct 09, 2015</pre>
 */
public class HelloWorldAOPExample {
    public static void main(String[] args) {
        MessageWriter target = new MessageWriter();
        ProxyFactory pf = new ProxyFactory();
        pf.addAdvice(new MessageDecorator());
        pf.setTarget(target);
        MessageWriter proxy = (MessageWriter) pf.getProxy();
        target.writeMessage();
        System.out.println("");
        proxy.writeMessage();
    }
}
