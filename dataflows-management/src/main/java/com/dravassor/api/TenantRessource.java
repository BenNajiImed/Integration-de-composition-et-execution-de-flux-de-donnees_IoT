
package com.dravassor.api;
import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.dravassor.domain.Tenant;
import com.dravassor.exceptions.EntityAlreadyExistsException;
import com.dravassor.exceptions.EntityNotFoundException;
import com.dravassor.services.TenantService;

@Path("/api/Tenants")
public class TenantRessource {

    @Inject
    TenantService tenantService;

    @GET
    @Path("/hello")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello RESTEasy";
    }

    @GET
    public List<Tenant> findall() {
        return  tenantService.findAll();
    }

    @GET
    @Path("/{id}")
    public Tenant findById(@PathParam("id") Long id) throws EntityNotFoundException {
        return  tenantService.findById(id);
    }

    @POST
    public Tenant create(Tenant p) throws EntityAlreadyExistsException {
        return  tenantService.create(p);
    }

    @PUT
    public Tenant update(Tenant p) throws EntityNotFoundException{
        return  tenantService.update(p);
    }

    @DELETE
    @Path("/{id}")
    public void delete(@PathParam("id") Long id){
        tenantService.remove(id);
    }

}
