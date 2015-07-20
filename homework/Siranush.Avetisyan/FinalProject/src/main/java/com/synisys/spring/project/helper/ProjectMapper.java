package com.synisys.spring.project.helper;

import com.synisys.spring.project.domain.Project;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Author : Siranush Avetisyan
 * Since : 10/7/2015
 */
public class ProjectMapper implements RowMapper<Project> {
    public Project mapRow(ResultSet row, int rowNum) throws SQLException {
        Project project = new Project(row.getInt("ProjectID"));
        project.setTitle(row.getString("Title"));
        project.setDescription(row.getString("Description"));
        return project;
    }
}
