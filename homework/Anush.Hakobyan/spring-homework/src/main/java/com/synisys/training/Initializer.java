package com.synisys.training;

import com.synisys.training.dao.ProjectDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Created by anush.hakobyan on 7/25/2015.
 */
public class Initializer {
    public static void main(String args[]) {
        GenericXmlApplicationContext xmlContext = new GenericXmlApplicationContext();
        xmlContext.load("classpath:config/application-config.xml");
        xmlContext.refresh();
        ProjectDao dao = new ProjectDao();
        dao.loadProject(1);
    }
}

