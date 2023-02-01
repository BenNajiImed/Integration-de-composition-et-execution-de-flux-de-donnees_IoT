package com.dravassor.api.exceptionsmappers;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.dravassor.exceptions.EntityAlreadyExistsException;

@Provider
public class EntityAlreadyExistsExceptionMapper
     implements ExceptionMapper<EntityAlreadyExistsException> {

   public Response toResponse(EntityAlreadyExistsException e) {
      return Response.status(Response.Status.BAD_REQUEST).build();
   }
}
