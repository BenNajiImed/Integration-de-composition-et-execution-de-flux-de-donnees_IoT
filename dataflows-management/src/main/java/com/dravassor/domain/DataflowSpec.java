package com.dravassor.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class DataflowSpec {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Tenant tenant;

    private boolean shared;
    private boolean started;
    private boolean activated;


    public DataflowSpec() {
    }

    public DataflowSpec(Tenant tenant, boolean shared, boolean started, boolean activated) {
        this.tenant = tenant;
        this.shared = shared;
        this.started = started;
        this.activated = activated;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    public boolean getShared() {
        return shared;
    }

    public void setShared(boolean shared) {
        this.shared = shared;
    }

    public boolean isStarted() {
        return started;
    }

    public void setStarted(boolean started) {
        this.started = started;
    }

    public boolean isActivated() {
        return activated;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    @Override
    public String toString() {
        return "DataflowSpec [activated=" + activated + ", id=" + id + ", shared=" + shared + ", started=" + started
                + ", tenant=" + tenant + "]";
    }

}