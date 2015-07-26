package spring.homework.Services.SQL;

import org.springframework.transaction.annotation.Transactional;
import spring.homework.Entities.Contact;
import spring.homework.Entities.Project;
import spring.homework.Services.ContactService;

import javax.persistence.Query;
import java.util.List;

/**
 * Created by Aram on 7/25/2015.
 */
public class ContactServiceImpl extends AbstractService<Contact> implements ContactService {
    @Transactional
    @Override
    public Contact save(Contact element) {
        if(element.getId() == null) {
            return super.save(element);
        }
        else {
            return entityManager.merge(element);
        }
    }

    @Transactional
    @Override
    public List<Contact> findByProject(Project project) {
        Query q = entityManager.createQuery("SELECT c FROM Contact c WHERE c.project = :project");
        q.setParameter("project", project);
        return q.getResultList();
    }

    @Transactional
    @Override
    public List<Contact> getAll() {
        return entityManager.createQuery("select c from Contact c").getResultList();
    }
}
