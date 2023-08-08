/**
 * 
 */
package io.github.mdimitri.rest.dto;

import io.github.mdimitri.domain.model.Follower;

/**
 * @author dell
 *
 */
public class FollowerResponse {
	
	    private Long id;
	    private String name;

	    public FollowerResponse() {
	    }

	    public FollowerResponse(Follower follower){
	        this(follower.getId(), follower.getFollower().getName());// id de segudor
	        //com o id do segudor:
	     //   this(follower.getFollower().getId(), follower.getFollower().getName());
	        
	    }

	    public FollowerResponse(Long id, String name) {
	        this.id = id;
	        this.name = name;
	    }

		/**
		 * @return the id
		 */
		public Long getId() {
			return id;
		}

		/**
		 * @param id the id to set
		 */
		public void setId(Long id) {
			this.id = id;
		}

		/**
		 * @return the name
		 */
		public String getName() {
			return name;
		}

		/**
		 * @param name the name to set
		 */
		public void setName(String name) {
			this.name = name;
		}
	    
	    

}
