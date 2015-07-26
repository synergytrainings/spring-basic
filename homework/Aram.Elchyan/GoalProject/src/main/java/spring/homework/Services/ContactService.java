package spring.homework.Services;

import spring.homework.Entities.Contact;
import spring.homework.Entities.Project;

import java.util.List;

/**
 * Created by Aram on 7/23/2015.
 */
public interface ContactService extends Service<Contact> {

    public List<Contact> findByProject(Project project);

}
