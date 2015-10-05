package com.synisys.training.spring.lesson3;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author armen mkrtchyan
 * @version 1.0
 */
public class HammingSuggester implements Suggester, ApplicationContextAware {

    private final Set<String> dictionary;

    public HammingSuggester(Set<String> dictionary) {
        this.dictionary = dictionary;
    }

    private int calculate(String from, String to) {
        if (from.length() != to.length()) {
            throw new IllegalArgumentException("hamming distance cannot be calculated for strings with different size");
        }
        int distance = 0;
        for (int i = 0; i < from.length(); i++) {
            if (from.charAt(i) != to.charAt(i)) {
                distance++;
            }
        }
        return distance;
    }

    @Override
    public String suggest(final String from) {
        PriorityQueue<String> heap = new PriorityQueue<>(dictionary.size(),
                (first, second) -> calculate(from, first) - calculate(from, second));
        heap.addAll(dictionary.stream().filter(items -> items.length() == from.length()).collect(Collectors.toList()));
        return heap.peek();
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("i have context");
    }
}
