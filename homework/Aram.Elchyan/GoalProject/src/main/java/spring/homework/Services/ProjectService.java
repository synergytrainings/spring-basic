package spring.homework.Services;

import spring.homework.Entities.Contact;
import spring.homework.Entities.Project;
import spring.homework.Entities.ProjectLocation;

/**
 * Created by Aram on 7/23/2015.
 */
public interface ProjectService extends Service<Project> {
    public Project findByContact(Contact contact);

    public Project findByProjectLocation(ProjectLocation projectLocation);
}
