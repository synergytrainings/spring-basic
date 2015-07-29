package com.synisys.training.dao;

import com.synisys.training.model.functionals.ProjectContact;
import com.synisys.training.model.functionals.ProjectLocation;
import com.synisys.training.model.project.Project;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by anush.hakobyan on 7/25/2015.
 */
public class ProjectDao extends JdbcDaoSupport{
    private static final String LOAD_PROJECT_ISSUES = "EXEC USP_DE_S_Projects @ProjectId = :ProjectId";
    private static final String INSERT_PROJECT_ISSUE = "EXEC dbo.USP_DE_S_ProjectLocations @ProjectId = :projectId";
    private static final String DELETE_PROJECT_ISSUE = "EXEC dbo.USP_DE_S_ProjectContacts @ProjectId = :projectId";

    public ProjectDao(){};

    public Project loadProject(Integer projectId) {
        Map<String, Object> parameters = new HashMap<String, Object>();
        parameters.put("ProjectId", projectId);
        getJdbcTemplate().query(LOAD_PROJECT_ISSUES, new ProjectRowMapper(projectId),parameters);
        return null;
    }

    private class ProjectRowMapper implements RowMapper<Project> {
        private Integer projectId;

        public ProjectRowMapper(Integer projectId) {
            this.projectId = projectId;
        }
        public Project mapRow(ResultSet resultSet, int i) throws SQLException {
            String title = resultSet.getString("Title");
            String description = resultSet.getString("Description");
            Integer sectorID = resultSet.getInt("author");
            Project project = new Project(this.projectId);
            project.setTitle(title);
            project.setDescription(description);
            project.setSectorId(sectorID);
            return project;
        }
    }

    public ProjectLocation loadProjectLocation() {

        return null;
    }

    public ProjectContact loadProjectContact() {
        return null;
    }
}
