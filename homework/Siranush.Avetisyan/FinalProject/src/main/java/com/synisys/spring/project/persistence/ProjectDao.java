package com.synisys.spring.project.persistence;

import com.synisys.spring.project.domain.Contact;
import com.synisys.spring.project.domain.Project;
import com.synisys.spring.project.domain.ProjectLocation;

import java.util.List;

/**
 * Author : Siranush Avetisyan
 * Since : 10/7/2015
 */
public interface ProjectDao {

    void createProject(String title, String description);

    Project getProject(Integer id);

    List<Project> listProjects();

    List<Contact> listProjectContacts(Integer id);

    List<ProjectLocation> listProjectLocations(Integer id);
}
