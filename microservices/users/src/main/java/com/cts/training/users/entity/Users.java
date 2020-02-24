package com.cts.training.users.entity;

import java.time.LocalDateTime;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

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
}
