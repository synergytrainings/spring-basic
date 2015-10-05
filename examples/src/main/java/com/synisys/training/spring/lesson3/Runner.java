package com.synisys.training.spring.lesson3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

/**
 * @author Armen.Mkrtchyan.
 * @version 1.0
 * @since <pre>May 21, 2015</pre>
 */
public class Runner {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("classpath:lesson3/springContext.xml");
        SearchEngine searchEngine = (SearchEngine) applicationContext.getBean("searchEngine");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        while (!s.equals("/exit")) {
            System.out.println(searchEngine.onKeyType(s));
            s = scanner.next();
        }
        System.out.println(applicationContext.getBean("&levensteinSuggester").getClass());
        applicationContext.destroy();
    }
}
