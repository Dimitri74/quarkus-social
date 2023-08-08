/**
 * 
 */
package io.github.mdimitri.rest.dto;

import java.util.List;

/**
 * @author dell
 *
 */
public class FollowersPerUserResponse {
	
	 private Integer followersCount;
	 private List<FollowerResponse> content;
	 
	/**
	 * @return the followersCount
	 */
	public Integer getFollowersCount() {
		return followersCount;
	}
	/**
	 * @param followersCount the followersCount to set
	 */
	public void setFollowersCount(Integer followersCount) {
		this.followersCount = followersCount;
	}
	/**
	 * @return the content
	 */
	public List<FollowerResponse> getContent() {
		return content;
	}
	/**
	 * @param content the content to set
	 */
	public void setContent(List<FollowerResponse> content) {
		this.content = content;
	}
	 
	 

}
