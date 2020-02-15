package com.cts.training.mavenweb.entity;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name = "blockedusers")

public class BlockedUsers {
	

	@Column
	private Integer userId;
	

	@Column
	private Integer blockeduserId;
	

	public  BlockedUsers() {}
	
	public BlockedUsers(Integer userid, Integer blockeduserId) {
			
			this.userId = userId;
			
			this.blockeduserId = blockeduserId;
		}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getBlockeduserId() {
		return blockeduserId;
	}

	public void setBlockeduserId(Integer blockeduserId) {
		this.blockeduserId = blockeduserId;
	}

	@Override
	public String toString() {
		return "Student [userid=" + userId +", blockeduserid=" + blockeduserId + "]";
	}
}
