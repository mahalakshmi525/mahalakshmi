package com.project.pixogram.users.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name="authorities")
@Getter
@Setter

public class Authorities {

	@Id
	@Column(name="username", length=100)
	private String username;
	
	@Column(name="authority", length=100)
	private String role;
}
