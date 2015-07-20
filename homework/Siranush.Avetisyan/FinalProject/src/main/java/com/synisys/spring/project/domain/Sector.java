package com.synisys.spring.project.domain;

import com.synisys.spring.project.entities.ClassifierImpl;

/**
 * Author : Siranush Avetisyan
 * Since : 10/7/2015
 */
public class Sector extends ClassifierImpl {

    private String name;

    public Sector(Integer id) {
        super(id);
    }

    public Sector(Integer id, String name) {
        super(id);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
