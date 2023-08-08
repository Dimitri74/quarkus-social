/**
 * 
 */
package io.github.mdimitri.rest.dto;

import java.time.LocalDateTime;

import io.github.mdimitri.domain.model.Post;

/**
 * @author dell
 *
 */
public class PostResponse {
	
	   private String text;
	    private LocalDateTime dataTime;
	    
	    public static PostResponse fromEntity(Post post){
	        var response = new PostResponse();
	        response.setText(post.getText());
	        response.setDataTime(post.getDataTime());
	        return response;
	    }

		/**
		 * @return the text
		 */
		public String getText() {
			return text;
		}

		/**
		 * @param text the text to set
		 */
		public void setText(String text) {
			this.text = text;
		}

		/**
		 * @return the dataTime
		 */
		public LocalDateTime getDataTime() {
			return dataTime;
		}

		/**
		 * @param dataTime the dataTime to set
		 */
		public void setDataTime(LocalDateTime dataTime) {
			this.dataTime = dataTime;
		}

		
	    
	    

}
