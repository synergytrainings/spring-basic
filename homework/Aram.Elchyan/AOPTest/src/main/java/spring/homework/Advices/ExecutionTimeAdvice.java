package spring.homework.Advices;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.util.StopWatch;

/**
 * Created by Aram on 6/29/2015.
 */
public class ExecutionTimeAdvice implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        StopWatch sw = new StopWatch();
        sw.start();
        Object returnValue = methodInvocation.proceed();
        sw.stop();
        System.out.println("Method invocation took " + sw.getTotalTimeMillis() + "mls.");

        return returnValue;
    }
}
