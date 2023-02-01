package com.dravassor.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Tenant {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String matricule;

    public Tenant() {
    }

    public Tenant(String name, String matricule) {
        this.name = name;
        this.matricule = matricule;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

}