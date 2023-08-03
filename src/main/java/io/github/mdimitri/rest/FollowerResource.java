/**
 * 
 */
package io.github.mdimitri.rest;

import io.github.mdimitri.domain.model.Follower;
import io.github.mdimitri.repository.FollowerRepository;
import io.github.mdimitri.repository.UserRepository;
import io.github.mdimitri.rest.dto.FollowerRequest;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

/**
 * @author Marcus Dimitri
 *
 */
@Path("/users/{userId}/followers")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class FollowerResource {
	
	    private FollowerRepository repository;
	    private UserRepository userRepository;

	    @Inject
	    public FollowerResource(
	            FollowerRepository repository, UserRepository userRepository) {
	        this.repository = repository;
	        this.userRepository = userRepository;
	    }

	    @PUT
	    public Response followUser(
	            @PathParam("userId") Long userId, FollowerRequest request){
	        var user = userRepository.findById(userId);
	        if(user == null){
	            return Response.status(Response.Status.NOT_FOUND).build();
	        }

	        var follower = userRepository.findById(request.getFollowerId());

	        var entity = new Follower();
	        entity.setUser(user);
	        entity.setFollower(follower);

	        repository.persist(entity);

	        return Response.status(Response.Status.NO_CONTENT).build();

	    }


}
