package com.cts.training.mavenweb.entity;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name = "followers")

public class Followers {

	@Column
	private Integer userId;
	

	@Column
	private Integer followerId;
	

	public  Followers() {}
	
	public Followers(Integer userid, Integer mediaId) {
			
			this.userId = userId;
			
			this.followerId = followerId;	
			
		}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getFollowerId() {
		return followerId;
	}

	public void setFollowerId(Integer followerId) {
		this.followerId = followerId;
	}
	@Override
	public String toString() {
		return "Student [userid=" + userId +", followersid=" + followerId + "]";
	}
}
