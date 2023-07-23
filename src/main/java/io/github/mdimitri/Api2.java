/**
 * 
 */
package io.github.mdimitri;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

/**
 * @author dell
 *
 */
@Path("/api")
public class Api2 {
	
	 @GET
	    @Produces(MediaType.TEXT_PLAIN)
	    public String api() {
	        return "Teste quarkus hotdeploy";
	    }

}
