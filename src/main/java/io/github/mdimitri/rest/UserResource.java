package io.github.mdimitri.rest;

import io.github.mdimitri.rest.dto.CreateUserRequest;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/users")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class UserResource {
	
	    @POST
	    @Transactional
	    public Response createUser( CreateUserRequest userRequest ){

		       return Response.ok(userRequest).build();
	                /*.status(Response.Status.CREATED.getStatusCode())
	                .entity(user)
	                .build();*/
	    }
	    
	    @GET
	    public Response listAllUsers(){
	       
	        return Response.ok().build();
	    }

}

