package com.synisys.training.spring.lesson3;

/**
 * @author Armen.Mkrtchyan.
 * @version 1.0
 * @since <pre>May 14, 2015</pre>
 */
public class SearchEngine {

    private final Suggester suggester;

    public SearchEngine(Suggester suggester) {
        this.suggester = suggester;
    }

    public String onKeyType(String someInput) {
        return suggester.suggest(someInput);
    }
}
