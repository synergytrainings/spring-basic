package spring.homework.Services.SQL;

import org.springframework.transaction.annotation.Transactional;
import spring.homework.Entities.Project;
import spring.homework.Entities.ProjectLocation;
import spring.homework.Entities.Sector;
import spring.homework.Services.ProjectLocationService;

import javax.persistence.Query;
import java.util.List;

/**
 * Created by Aram on 7/25/2015.
 */
public class ProjectLocationServiceImpl extends AbstractService<ProjectLocation> implements ProjectLocationService {
    @Transactional
    @Override
    public ProjectLocation save(ProjectLocation element) {
        if(element.getId() == null) {
            return super.save(element);
        }
        else {
            return entityManager.merge(element);
        }
    }

    @Transactional
    @Override
    public List<ProjectLocation> findByProject(Project project) {
        Query q = entityManager.createQuery("SELECT p FROM ProjectLocation p WHERE p.project = :project");
        q.setParameter("project", project);
        return q.getResultList();
    }

    @Transactional
    @Override
    public ProjectLocation findBySector(Sector sector) {
        Query q = entityManager.createQuery("SELECT p FROM ProjectLocation p WHERE p.sector = :sector");
        q.setParameter("sector", sector);
        return (ProjectLocation)q.getSingleResult();
    }

    @Transactional
    @Override
    public List<ProjectLocation> getAll() {
        return entityManager.createQuery("select pl from ProjectLocation pl").getResultList();
    }
}
