package com.synisys.training.spring.lesson3;

import org.springframework.beans.factory.FactoryBean;

import java.util.Set;

/**
 * @author Armen.Mkrtchyan.
 * @version 1.0
 * @since <pre>Oct 06, 2015</pre>
 */
public class SuggesterFactoryBean implements FactoryBean<Suggester> {


    private final SuggesterType type;
    private final Set<String> dict;

    public SuggesterFactoryBean(SuggesterType type, Set<String> dict) {
        this.type = type;
        this.dict = dict;
    }


    @Override
    public Suggester getObject() throws Exception {
        switch (type) {
            case HAMMING:
                return new HammingSuggester(dict);
            case LEVENSTEIN:
                return new LevenshteinSuggester(dict);
            default:
                throw new IllegalArgumentException("type is not recognised");
        }

    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
