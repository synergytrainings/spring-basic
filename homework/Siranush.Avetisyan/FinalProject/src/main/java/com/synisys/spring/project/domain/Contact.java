package com.synisys.spring.project.domain;

import com.synisys.spring.project.entities.ClassifierImpl;

/**
 * Author : Siranush Avetisyan
 * Since : 10/7/2015
 */
public class Contact extends ClassifierImpl {

    private String email;
    private String number;

    public Contact(Integer id) {
        super(id);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
