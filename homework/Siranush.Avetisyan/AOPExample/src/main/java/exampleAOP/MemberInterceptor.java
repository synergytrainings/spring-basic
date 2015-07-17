package exampleAOP;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.util.StopWatch;

/**
 * Author : Siranush Avetisyan
 * Since : 16/6/2015
 */
public class MemberInterceptor implements MethodInterceptor {
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        /*long startTime = System.currentTimeMillis();
        try {
            return methodInvocation.proceed();
        } finally {
            long endTime = System.currentTimeMillis();
            long executionTime = endTime - startTime;
            System.out.println("Method Name: " + "\"" + methodInvocation.getMethod().getName() + "\""
                    + " Execution Time: " + executionTime + " ms");
        }*/
        StopWatch watch = new StopWatch();
        watch.start();
        Object value = methodInvocation.proceed();
        watch.stop();
        System.out.println("\"" + methodInvocation.getMethod().getName() + "\"" + " method took " + watch.getTotalTimeMillis() + " ms");
        return value;
    }

}
