package spring.homework.Entities;

import javax.validation.constraints.NotNull;

import javax.persistence.*;

/**
 * Created by Aram on 7/19/2015.
 */
@Entity
@Table(name="Contact")
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique=true, nullable=false)
    private Integer id;

    @JoinColumn(name = "projectId", referencedColumnName = "id")
    @ManyToOne
    private Project project;

    @NotNull
    @Column(name = "email")
    private String email;

    @NotNull
    @Column(name = "phoneNumber")
    private String phoneNumber;

    public Contact() {}

    public Contact(String email, String phoneNumber) {
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Integer getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }
}