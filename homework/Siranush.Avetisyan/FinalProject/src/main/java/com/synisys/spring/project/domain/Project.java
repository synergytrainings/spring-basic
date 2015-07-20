package com.synisys.spring.project.domain;

import java.util.List;
import java.util.Objects;

/**
 * Author : Siranush Avetisyan
 * Since : 10/7/2015
 */
public class Project {

    private Integer id;
    private String title;
    private String description;
    private List<Contact> contactList;
    private List<ProjectLocation> projectLocationList;

    public Project(Integer id) {
        this.id = Objects.requireNonNull(id);
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Contact> getContactList() {
        return contactList;
    }

    public void setContactList(List<Contact> contactList) {
        this.contactList = contactList;
    }

    public List<ProjectLocation> getProjectLocationList() {
        return projectLocationList;
    }

    public void setProjectLocationList(List<ProjectLocation> projectLocationList) {
        this.projectLocationList = projectLocationList;
    }
}
