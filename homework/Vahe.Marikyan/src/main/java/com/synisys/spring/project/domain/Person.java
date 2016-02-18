package com.synisys.spring.project.domain;

import com.synisys.spring.project.entities.EntityImpl;

/**
 * @author vahe.marikyan
 * @since 2/13/2016.
 */
public class Person extends EntityImpl {

    private String firstName;

    private String lastName;

    private String address;

    public Person(Integer id) {
        super(id);
    }



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
