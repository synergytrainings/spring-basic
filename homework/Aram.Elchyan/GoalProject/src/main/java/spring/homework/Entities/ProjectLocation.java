package spring.homework.Entities;

import javax.validation.constraints.NotNull;

import javax.persistence.*;

/**
 * Created by Aram on 7/19/2015.
 */
@Entity
@Table(name = "projectLocation")
public class ProjectLocation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique=true, nullable=false)
    private Integer id;

    @NotNull
    @Column(name = "percentage")
    private int percent;

    @JoinColumn(name = "sectorId", referencedColumnName = "id")
    @OneToOne
    private Sector sector;

    @JoinColumn(name = "projectId", referencedColumnName = "id")
    @ManyToOne
    private Project project;

    public ProjectLocation() {}

    public ProjectLocation(int percent) {
        this.percent = percent;
    }

    public Integer getId() {
        return id;
    }

    public int getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        this.percent = percent;
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
}
