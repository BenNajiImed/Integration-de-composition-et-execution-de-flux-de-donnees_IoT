package com.dravassor.repositories;

import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import com.dravassor.domain.Tenant;

@ApplicationScoped
public class TenantRepository {
    @Inject
    EntityManager em;

    public Tenant insert(Tenant tenant) {
        em.persist(tenant);
        return tenant;
    }

    public Tenant findById(Long id) {
        return em.find(Tenant.class, id);
    }

    public String deleteById(Long id) {
        try {
            em.remove(findById(id));
        } catch (Exception e) {
            return "Not deleted";
        }
        return "Deleted";
    }

    public List<Tenant> findAll() {
        return (List<Tenant>) em.createQuery("SELECT tenant FROM Tenant tenant", Tenant.class).getResultList();
    }

    public Tenant update(Tenant tenant) {
        em.merge(tenant);
        return tenant;
    }
}
