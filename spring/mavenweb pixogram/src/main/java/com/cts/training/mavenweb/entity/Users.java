package com.cts.training.mavenweb.entity;

import java.time.LocalDateTime;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Table(name = "users")

public class Users {
	@ Id
	
     private Integer Id;

	@Column(name = "username")
	private String username;
	
	@Column
	private String password;
	
	@Column
	private String email;
	
	@Column
	private String profile;
	
	@CreationTimestamp
	@Column
	private LocalDateTime createdon;
	
	@UpdateTimestamp
	@Column
	private LocalDateTime updatedon;
	
	@Column
	private boolean enabled;

	
	
	public Users() {}
	
public Users(Integer id, String username, String password,String email,String profile,LocalDateTime createdon,LocalDateTime updatedon , boolean enabled) {
		
		this.Id = id;
		this.username = username;
		this.password= password;
		this.email = email;
		this.profile = profile;
		this.createdon= createdon;
		this.updatedon= updatedon;
		this.enabled= enabled;
	}

public Integer getId() {
	return Id;
}

public void setId(Integer id) {
	Id = id;
}

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getProfilepic() {
	return profile;
}

public void setProfilepic(String profilepic) {
	this.profile = profile;
}

public LocalDateTime getCreatedon() {
	return createdon;
}

public void setCreatedon(LocalDateTime createdon) {
	this.createdon = createdon;
}

public LocalDateTime getUpdatedon() {
	return updatedon;
}

public void setUpdatedon(LocalDateTime updatedon) {
	this.updatedon = updatedon;
}

public boolean isEnabled() {
	return enabled;
}

public void setEnabled(boolean enabled) {
	this.enabled = enabled;
}

@Override
public String toString() {
	return "Student [id=" + Id + ", username=" + username + ", password=" + password +", email=" + email + ",profile=" + profile + ", createdon=" + createdon +", updatedon=" + updatedon + ", enabled=" + enabled + "]";
}

}
