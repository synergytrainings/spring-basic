package com.synisys.training.spring.lesson3;

import java.util.Set;

/**
 * @author Armen.Mkrtchyan.
 * @version 1.0
 * @since <pre>Oct 06, 2015</pre>
 */
public class SuggesterOtherFactoryBean {

    public Suggester getSuggester(SuggesterType type, Set<String> dict) {
        switch (type) {
            case HAMMING:
                return new HammingSuggester(dict);
            case LEVENSTEIN:
                return new LevenshteinSuggester(dict);
            default:
                throw new IllegalArgumentException("type is not recognised");
        }
    }
}
