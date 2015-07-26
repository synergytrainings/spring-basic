package spring.homework.Services.SQL;

import org.springframework.transaction.annotation.Transactional;
import spring.homework.Entities.ProjectLocation;
import spring.homework.Entities.Sector;
import spring.homework.Services.SectorService;

import javax.persistence.Query;
import java.util.List;

/**
 * Created by Aram on 7/25/2015.
 */
public class SectorServiceImpl extends AbstractService<Sector>  implements SectorService {
    @Transactional
    @Override
    public Sector save(Sector element) {
        if(element.getId() == null) {
            return super.save(element);
        }
        else {
            return entityManager.merge(element);
        }
    }

    @Transactional
    @Override
    public Sector findByProjectLocation(ProjectLocation projectLocation) {
        Query q = entityManager.createQuery("SELECT s FROM Sector s WHERE s.projectLocation = :pl");
        q.setParameter("pl", projectLocation);
        return (Sector)q.getSingleResult();
    }

    @Transactional
    @Override
    public List<Sector> getAll() {
        return entityManager.createQuery("select s from Sector s").getResultList();
    }
}
