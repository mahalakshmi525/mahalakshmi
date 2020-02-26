package com.project.pixogram.users.model;
	import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;
	
	
	@Getter
	@Setter
	public class UsersModel {
		private Integer id;
		private String username;
		private String password;
		private String email;
		private String firstName;
		private String lastName;
		private LocalDate dob;

		
	}


