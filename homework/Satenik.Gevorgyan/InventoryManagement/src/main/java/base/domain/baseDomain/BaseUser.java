package base.domain.baseDomain;

import base.domain.Role;

/**
 * Created by Satenik.Gevorgyan on 7/29/2015.
 */
public class BaseUser {
    private Integer userID;
    private Role userRole;
    private String name;
    private String surname;


    //----------- Getters and Setters -----------//


    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public Role getUserRole() {
        return userRole;
    }

    public void setUserRole(Role userRole) {
        this.userRole = userRole;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
