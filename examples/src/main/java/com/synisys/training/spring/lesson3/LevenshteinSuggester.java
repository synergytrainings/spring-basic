package com.synisys.training.spring.lesson3;

import com.google.common.collect.Sets;
import org.apache.commons.lang3.StringUtils;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author armen mkrtchyan
 * @version 1.0
 */
public class LevenshteinSuggester implements Suggester {

    private final Set<String> dictionary;

    public LevenshteinSuggester(Set<String> dictionary) {
        this.dictionary = dictionary;
    }

    private int calculate(String from, String to) {
        return StringUtils.getLevenshteinDistance(from, to);
    }

    @Override
    public String suggest(final String from) {
        PriorityQueue<String> heap = new PriorityQueue<>(dictionary.size(),
                (first, second) -> calculate(from, first) - calculate(from, second));
        heap.addAll(dictionary.stream().collect(Collectors.toList()));
        return heap.peek();
    }

}
