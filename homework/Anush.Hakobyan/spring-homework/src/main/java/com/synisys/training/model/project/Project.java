package com.synisys.training.model.project;

import com.synisys.training.model.functionals.ProjectContact;
import com.synisys.training.model.functionals.ProjectLocation;

import java.util.List;
import java.util.Objects;

/**
 * Created by anush.hakobyan on 7/25/2015.
 */
public class Project {
    private int id;
    private String title;
    private String description;
    private Integer sectorId;
    private List<ProjectLocation> projectLocations;
    private List<ProjectContact> projectContacts;


    public Project() {}

    public Project(Integer id) {
        Objects.requireNonNull(id);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<ProjectLocation> getProjectLocations() {
        return this.projectLocations;
    }

    public void setProjectLocations(List<ProjectLocation> projectLocations) {
        this.projectLocations = projectLocations;
    }

    public List<ProjectContact> getProjectContacts() {
        return this.projectContacts;
    }

    public void setProjectContacts(List<ProjectContact> projectContacts) {
        this.projectContacts = projectContacts;
    }

    public Integer getSectorId() {
        return sectorId;
    }

    public void setSectorId(Integer sectorId) {
        this.sectorId = sectorId;
    }
}
