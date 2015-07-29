package com.synisys.training.model.functionals;

import com.synisys.training.model.project.Project;

/**
 * Created by anush.hakobyan on 7/25/2015.
 */
public class ProjectLocation extends AbstractFunctional<Project> {

    private String locationName;

    public ProjectLocation(Project project) {
        super(project);
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }
}
