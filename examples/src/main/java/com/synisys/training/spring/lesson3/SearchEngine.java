package com.synisys.training.spring.lesson3;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author Armen.Mkrtchyan.
 * @version 1.0
 * @since <pre>May 14, 2015</pre>
 */
public class SearchEngine implements InitializingBean, DisposableBean {

    public void init() {
        System.out.println("search engine initialized using method");
    }

    @PostConstruct
    public void otherInit() {
        System.out.println("search engine initialized using @PostConstruct");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("search engine initialized implementing InitializingBean interface");
    }


    public void dest(){
        System.out.println("search engine destroyed using method");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("search engine destroyed implementing DisposableBean interface");
    }

    @PreDestroy
    public void otherDest() {
        System.out.println("search engine destroyed using @PreDestroy");
    }

    private final Suggester suggester;

    public SearchEngine(Suggester suggester) {
        this.suggester = suggester;
    }

    public String onKeyType(String someInput) {
        return suggester.suggest(someInput);
    }


}
