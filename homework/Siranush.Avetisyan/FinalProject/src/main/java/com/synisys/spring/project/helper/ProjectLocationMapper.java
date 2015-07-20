package com.synisys.spring.project.helper;

import com.synisys.spring.project.domain.Project;
import com.synisys.spring.project.domain.ProjectLocation;
import com.synisys.spring.project.domain.Sector;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Author : Siranush Avetisyan
 * Since : 10/7/2015
 */
public class ProjectLocationMapper implements RowMapper<ProjectLocation> {
    public ProjectLocation mapRow(ResultSet row, int rowNum) throws SQLException {
        ProjectLocation projectLocation = new ProjectLocation(row.getInt("ProjectLocationID"));
        projectLocation.setPercent(row.getBigDecimal("Percent"));

        Sector sector = new Sector(row.getInt("SectorID"));
        sector.setName(row.getString("Name"));

        Project project  = new Project(row.getInt("ProjectID"));
        project.setTitle(row.getString("Title"));
        project.setDescription(row.getString("Description"));

        projectLocation.setSector(sector);
        projectLocation.setProject(project);
        return projectLocation;
    }
}
