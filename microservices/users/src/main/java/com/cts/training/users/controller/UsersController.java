package com.cts.training.users.controller;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cts.training.users.entity.Users;
import com.cts.training.users.repository.UsersRepository;


@RestController
public class UsersController {
	@Autowired
	private UsersRepository usersRepository;
	
	@GetMapping("/users/{userId}")
	public ResponseEntity<Users> actionDetail(@PathVariable Integer userId){
		Optional<Users> record = this.usersRepository.findById(userId);
		Users users = new Users();
		if(record.isPresent())
			users=record.get();
		ResponseEntity<Users> response = 
								new ResponseEntity<Users>(users, HttpStatus.OK);
		return response;
		 
	}

}
