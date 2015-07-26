package spring.homework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import spring.homework.Entities.Contact;
import spring.homework.Entities.Project;
import spring.homework.Services.ContactService;
import spring.homework.Services.ProjectService;

import java.util.List;

public class StartApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("spring-config.xml");
        ctx.refresh();
        ContactService contactService = (ContactService)ctx.getBean("ContactService");
        ProjectService projectService = (ProjectService)ctx.getBean("ProjectService");
        Contact contact = new Contact("email", "phoneNumber");
        Project project = new Project("project1", "description1");
        contact.setProject(project);

        project = projectService.save(project);
        contact = contactService.save(contact);

        List<Project> projects = projectService.getAll();

        for(Project proj : projects) {
            for(Contact cont : proj.getContacts()) {
                System.out.println(cont.getId());
            }
        }
    }
}
