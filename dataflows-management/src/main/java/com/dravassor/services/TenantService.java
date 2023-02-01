package com.dravassor.services;

import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import com.dravassor.domain.Tenant;
import com.dravassor.repositories.TenantRepository;


@ApplicationScoped
public class TenantService {
    @Inject
    TenantRepository TenantRepository;

    public Tenant create(Tenant tenant) {
        return TenantRepository.insert(tenant);
    }

    
    public Tenant findById(Long id) {
        return TenantRepository.findById(id);
    }

    public String remove(Long id) {
        return TenantRepository.deleteById(id);
    }

    
    public List<Tenant> findAll() {
        return TenantRepository.findAll();
    }
    
    public Tenant update(Tenant tenant) {
        return TenantRepository.update(tenant);
    }
}
