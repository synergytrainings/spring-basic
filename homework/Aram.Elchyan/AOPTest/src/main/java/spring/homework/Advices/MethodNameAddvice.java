package spring.homework.Advices;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Created by Aram on 6/30/2015.
 */
public class MethodNameAddvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("Invoking method " + method.getName());
        System.out.println("Number of parameters: " + method.getParameterTypes().length);
    }
}
