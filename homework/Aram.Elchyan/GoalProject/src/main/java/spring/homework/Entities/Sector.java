package spring.homework.Entities;

import javax.validation.constraints.NotNull;

import javax.persistence.*;

/**
 * Created by Aram on 7/19/2015.
 */
@Entity
@Table(name = "Sector")
public class Sector {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique=true, nullable=false)
    private Integer id;

    @JoinColumn(name = "projectLocationId", referencedColumnName = "id")
    @OneToOne
    private ProjectLocation projectLocation;

    @NotNull
    @Column(name = "name")
    private String name;

    public Sector() {}

    public Sector(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public ProjectLocation getProjectLocation() {
        return projectLocation;
    }

    public void setProjectLocationId(ProjectLocation projectLocation) {
        this.projectLocation = projectLocation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
