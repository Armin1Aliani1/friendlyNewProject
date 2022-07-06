package newProject.base.repository.impl;

import newProject.base.BaseEntity;
import newProject.base.repository.BaseRepository;
import newProject.util.HibernateUtil;

import javax.persistence.EntityManager;

public abstract class BaseRepositoryImpl<T extends BaseEntity> implements BaseRepository<T> {

    EntityManager em = HibernateUtil.getEmf().createEntityManager();

    public abstract Class<T> getEntityClass();

    @Override
    public void save(T t) {
        em.persist(t);
    }

    @Override
    public void delete(T t) {
        em.remove(t);
    }

    @Override
    public T update(T t) {
        return em.merge(t);
    }

    @Override
    public void beginTransaction() {
        em.getTransaction().begin();
    }

    @Override
    public void commitTransaction() {
        em.getTransaction().commit();
    }

    @Override
    public T findById(int id) {
        return em.find(getEntityClass(), id);
    }

    public EntityManager getEm() {
        return em;
    }
}
