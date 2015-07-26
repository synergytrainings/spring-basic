package spring.homework.Services.SQL;

import org.springframework.transaction.annotation.Transactional;
import spring.homework.Services.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by Aram on 7/25/2015.
 */
public abstract class AbstractService<T> implements Service<T> {
    @PersistenceContext
    protected EntityManager entityManager;

    @Transactional
    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Transactional
    @Override
    public T save(T element) {
        entityManager.persist(element);
        return element;
    }

    @Transactional
    @Override
    public void update(T element) {
        entityManager.refresh(entityManager.merge(element));
    }

    @Transactional
    @Override
    public void delete(T element) {
        entityManager.remove(element);
    }
}
