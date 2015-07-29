package com.synisys.training.model.functionals;

import com.synisys.training.model.project.Project;

/**
 * Created by anush.hakobyan on 7/25/2015.
 */
public class ProjectContact extends AbstractFunctional<Project> {
    private int contactId;
    private String conactEmail;
    private String contactPhone;

    public ProjectContact(Project project) {
        super(project);
    }

    public int getContactId() {
        return contactId;
    }

    public void setContactId(int contactId) {
        this.contactId = contactId;
    }

    public String getConactEmail() {
        return conactEmail;
    }

    public void setConactEmail(String conactEmail) {
        this.conactEmail = conactEmail;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }
}
