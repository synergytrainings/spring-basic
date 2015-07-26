package spring.homework.Entities;

import javax.validation.constraints.NotNull;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Aram on 7/19/2015.
 */
@Entity
@Table(name = "Project")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique=true, nullable=false)
    private Integer id;

    @NotNull
    @Column(name = "title")
    private String title;

    @NotNull
    @Column(name = "description")
    private String description;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "id")
    private List<ProjectLocation> locations;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "id")
    private List<Contact> contacts;

    public Project() {}

    public Project(String title, String description) {
        this.title = title;
        this.description = description;
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

    public List<ProjectLocation> getLocations() {
        return locations;
    }

    public void setLocations(List<ProjectLocation> locations) {
        this.locations = locations;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }
}
