package newProject.repository.impl;

import newProject.base.repository.impl.BaseRepositoryImpl;
import newProject.domain.Admin;
import newProject.repository.AdminRepository;

import javax.persistence.EntityManager;

public class AdminRepositoryImpl extends BaseRepositoryImpl<Admin> implements AdminRepository {

    EntityManager em;

    @Override
    public Class<Admin> getEntityClass() {
        return Admin.class;
    }

    @Override
    public Admin findByUsername(String username) {
        em = super.getEm();
        return em.createQuery("select a from Admin a where a.username=: username", Admin.class).
                setParameter("username", username).getSingleResult();
    }
}
