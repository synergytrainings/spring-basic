package spring.homework;

import org.springframework.aop.framework.ProxyFactory;
import spring.homework.Advices.ExceptionCatcherAdvice;
import spring.homework.Advices.ExecutionTimeAdvice;
import spring.homework.Advices.MethodNameAddvice;

/**
 * Created by Aram on 6/29/2015.
 */
public class AopTest {
        public static void main(String[] args) {
                ProxyFactory pf = new ProxyFactory();

                pf.addAdvice(new ExceptionCatcherAdvice());
                pf.addAdvice(new ExecutionTimeAdvice());
                pf.addAdvice(new MethodNameAddvice());

                pf.setTarget(new Target());

                Target target = (Target)pf.getProxy();

                target.doComplexCalcualtion(5, 6);

                try {
                        target.playRussianRoulette();
                }
                catch (Exception ex) { }

                target.sendRequestToDB();
        }
}
