package com.cts.training.mavenweb.entity;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name = "authorities")

public class Authorities {
	
	@Column(name = "username")
	private String username;
	
	@Column
	private String authority;
	
	public Authorities() {}
	
	public Authorities( String username, String authority) {
			
			this.username = username;
			this.authority=authority;

}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}
	@Override
	public String toString() {
		return "Student [username=" + username +", authority=" + authority + "]";
	}
}

