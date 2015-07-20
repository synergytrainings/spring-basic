package com.synisys.spring.project.persistence;

import com.synisys.spring.project.domain.Contact;
import com.synisys.spring.project.domain.Project;
import com.synisys.spring.project.domain.ProjectLocation;
import com.synisys.spring.project.helper.ContactMapper;
import com.synisys.spring.project.helper.ProjectLocationMapper;
import com.synisys.spring.project.helper.ProjectMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * Author : Siranush Avetisyan
 * Since : 10/7/2015
 */
public class ProjectDaoImpl implements ProjectDao {

    private JdbcTemplate jdbcTemplate;

    public ProjectDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void createProject(String title, String description) {
        String query = "INSERT INTO Project (Title, Description) VALUES (?, ?)";
        jdbcTemplate.update(query, title, description);
    }

    public Project getProject(Integer id) {
        String query = "SELECT * FROM Project WHERE id = ?";
        return jdbcTemplate.queryForObject(query, new Object[]{id}, new ProjectMapper());
    }

    public List<Project> listProjects() {
        String query = "SELECT * FROM Project";
        return jdbcTemplate.query(query, new ProjectMapper());
    }

    public List<Contact> listProjectContacts(Integer id) {
        String query = "SELECT * FROM ProjectContact LEFT JOIN C_Contact ON ProjectContact.ContactID = C_Contact.ContactID WHERE ProjectContact.ProjectID = ?";
        return jdbcTemplate.query(query, new Object[]{id}, new ContactMapper());
    }

    public List<ProjectLocation> listProjectLocations(Integer id) {
        String query = "SELECT * FROM ProjectLocation LEFT JOIN Project ON ProjectLocation.ProjectID = Project.ProjectID LEFT JOIN C_Sector ON ProjectLocation.SectorID = C_Sector.SectorID WHERE ProjectLocation.ProjectID = ?";
        return jdbcTemplate.query(query, new Object[]{id}, new ProjectLocationMapper());
    }
}
