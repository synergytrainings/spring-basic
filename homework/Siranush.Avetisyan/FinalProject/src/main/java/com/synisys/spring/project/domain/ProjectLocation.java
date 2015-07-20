package com.synisys.spring.project.domain;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * Author : Siranush Avetisyan
 * Since : 10/7/2015
 */
public class ProjectLocation {

    private Integer id;
    private Sector sector;
    private Project project;
    private BigDecimal percent;

    public ProjectLocation(Integer id) {
        this.id = Objects.requireNonNull(id);
    }

    public ProjectLocation(Integer id, Project project) {
        this.id = Objects.requireNonNull(id);
        this.project = project;
    }

    public Integer getId() {
        return id;
    }

    public Sector getSector() {
        return sector;
    }

    public void setSector(Sector sector) {
        this.sector = sector;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public BigDecimal getPercent() {
        return percent;
    }

    public void setPercent(BigDecimal percent) {
        this.percent = percent;
    }
}
