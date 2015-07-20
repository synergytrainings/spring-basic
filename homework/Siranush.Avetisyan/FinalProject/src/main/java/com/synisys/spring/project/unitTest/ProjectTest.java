package com.synisys.spring.project.unitTest;

import com.synisys.spring.project.domain.Project;
import com.synisys.spring.project.persistence.ProjectDao;
import com.synisys.spring.project.persistence.ProjectDaoImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.assertNotNull;

/**
 * Author : Siranush Avetisyan
 * Since : 10/7/2015
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/applicationContext.xml"})
public class ProjectTest {

    private ApplicationContext context;

    @Before
    public void beforeTest() {
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @Test
    public void testProject() {
        ProjectDao projectDao = (ProjectDaoImpl) context.getBean("projectDao");

        /*projectDao.createProject("First Project", "First Project Description");
        projectDao.createProject("Second Project", "Second Project Description");
        projectDao.createProject("Third Project", "Third Project Description");*/

        List<Project> projectList = projectDao.listProjects();
        for(Project project : projectList) {
            project.setContactList(projectDao.listProjectContacts(project.getId()));
            project.setProjectLocationList(projectDao.listProjectLocations(project.getId()));
        }

        assertNotNull("Project List is Empty", projectList);
    }
}
