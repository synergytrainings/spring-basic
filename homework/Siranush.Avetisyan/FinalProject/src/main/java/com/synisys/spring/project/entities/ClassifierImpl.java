package com.synisys.spring.project.entities;

import java.util.Objects;

/**
 * Author : Siranush Avetisyan
 * Since : 10/7/2015
 */
public class ClassifierImpl implements Classifier {

    private Integer id;

    public ClassifierImpl(Integer id) {
        this.id = Objects.requireNonNull(id);
    }

    public Integer getId() {
        return id;
    }
}
