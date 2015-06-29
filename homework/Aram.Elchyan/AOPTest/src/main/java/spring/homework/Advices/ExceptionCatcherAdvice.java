package spring.homework.Advices;

import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;

/**
 * Created by Aram on 6/30/2015.
 */
public class ExceptionCatcherAdvice implements ThrowsAdvice{
    public void afterThrowing(Method method, Object[] args, Object target, Exception ex) {
        System.out.println("Exception of type " + ex.getClass() + "caught!");
        System.out.println("Exception message: " + ex.getMessage());
    }
}
