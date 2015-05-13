package com.synisys.training.spring.lesson2;

import java.util.Set;

/**
 * @author Armen.Mkrtchyan.
 * @version 1.0
 * @since <pre>May 14, 2015</pre>
 */
public class SearchEngine {

    private HammingSuggester suggester;

    public SearchEngine(Set<String> dictionary) {
        suggester = new HammingSuggester(dictionary);
    }

    public String onKeyType(String someInput) {
        return suggester.suggest(someInput);
    }
}
