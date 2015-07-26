package spring.homework.Services.SQL;

import org.springframework.transaction.annotation.Transactional;
import spring.homework.Entities.Contact;
import spring.homework.Entities.Project;
import spring.homework.Entities.ProjectLocation;
import spring.homework.Services.ProjectService;

import javax.persistence.Query;
import java.util.List;

/**
 * Created by Aram on 7/25/2015.
 */
public class ProjectServiceImpl extends AbstractService<Project>  implements ProjectService {
    @Transactional
    @Override
    public Project save(Project element) {
        if(element.getId() == null) {
            return super.save(element);
        }
        else {
            return entityManager.merge(element);
        }
    }

    @Transactional
    @Override
    public Project findByContact(Contact contact) {
        Query q = entityManager.createQuery("SELECT p FROM Project p WHERE p.contact = :contact");
        q.setParameter("contact", contact);
        return (Project)q.getSingleResult();
    }

    @Transactional
    @Override
    public Project findByProjectLocation(ProjectLocation projectLocation) {
        Query q = entityManager.createQuery("SELECT p FROM Project p WHERE p.projectLocation = :pl");
        q.setParameter("pl", projectLocation);
        return (Project)q.getSingleResult();
    }

    @Transactional
    @Override
    public List<Project> getAll() {
        return entityManager.createQuery("select p from Project p").getResultList();
    }
}
