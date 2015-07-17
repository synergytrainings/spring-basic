package exampleAOP;

import org.springframework.aop.framework.ProxyFactory;

/**
 * Author : Siranush Avetisyan
 * Since : 16/6/2015
 */
public class Runner {
    public static void main(String[] args) {
        Member target = new MemberImpl();
        ProxyFactory pf = new ProxyFactory();
        pf.addAdvice(new MemberInterceptor());
        pf.setTarget(target);

        Member proxy = (Member) pf.getProxy();

        target.printName();
        target.printNationality();
        target.printSerialNumber();

        proxy.printName();
        proxy.printNationality();
        proxy.printSerialNumber();
    }
}
