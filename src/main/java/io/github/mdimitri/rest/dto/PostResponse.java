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
	    private LocalDateTime dateTime;
	    
	    public static PostResponse fromEntity(Post post){
	        var response = new PostResponse();
	        response.setText(post.getText());
	        response.setDateTime(post.getDataTime());
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
		 * @return the dateTime
		 */
		public LocalDateTime getDateTime() {
			return dateTime;
		}

		/**
		 * @param dateTime the dateTime to set
		 */
		public void setDateTime(LocalDateTime dateTime) {
			this.dateTime = dateTime;
		}
	    
	    

}
