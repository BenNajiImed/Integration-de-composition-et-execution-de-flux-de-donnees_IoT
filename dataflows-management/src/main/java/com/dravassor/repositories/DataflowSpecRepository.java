package com.dravassor.repositories;

import java.util.List;
import javax.transaction.Transactional;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.dravassor.domain.DataflowSpec;

@ApplicationScoped
public class DataflowSpecRepository {
    @Inject
    EntityManager em;

    @Transactional
    public DataflowSpec insert(DataflowSpec dataflowSpec) {
        em.persist(dataflowSpec);
        return dataflowSpec;
    }

    public DataflowSpec findById(Long id) {
        return em.find(DataflowSpec.class, id);
    }

    public List<DataflowSpec> findAll() {
        return (List<DataflowSpec>) em.createQuery("SELECT dataflowspec FROM DataflowSpec dataflowspec", DataflowSpec.class).getResultList();
    }

    public String deleteById(Long id) {
        try {
            em.remove(findById(id));
        } catch (Exception e) {
            return "Not deleted";
        }
        return "Deleted";
    }

    

    public DataflowSpec update(DataflowSpec dataflowSpec) {
        em.merge(dataflowSpec);
        return dataflowSpec;
    }
}
