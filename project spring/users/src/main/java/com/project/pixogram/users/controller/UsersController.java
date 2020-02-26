package com.project.pixogram.users.controller;

import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.project.pixogram.users.entity.Users;
import com.project.pixogram.users.exception.UsersErrorResponse;
import com.project.pixogram.users.exception.UsersNotFoundException;
import com.project.pixogram.users.service.IUsersService;

@RestController

public class UsersController {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
  
    @Autowired
	private IUsersService usersService;
	
	
	@GetMapping("/users")
    public ResponseEntity<List<Users>> exposeAll() {
		
		List<Users> users = this.usersService.findAllUsers();
		if(users == null)
			throw new UsersNotFoundException("Not able to fetch records!!!");
		ResponseEntity<List<Users>> response = 
								new ResponseEntity<List<Users>>(users, HttpStatus.OK);
		
		
		return response;
	}
	
	
	// {<data variable>}
	@GetMapping("/users/{usersId}") // GET HTTP VERB
	public ResponseEntity<Users> getById(@PathVariable Integer usersId) {
		
		Users users = this.usersService.findUsersById(usersId);
		if(users == null)
			throw new UsersNotFoundException("User with id-" + usersId + " not Found");
		
		ResponseEntity<Users> response = 
				new ResponseEntity<Users>(users, HttpStatus.OK);

		return response;
	}
	
	@PostMapping("/users")
    public ResponseEntity<Users> save(@RequestBody Users users) {
		
		if(!this.usersService.addUsers(users))
			throw new RuntimeException("Could not add new record!!!");
	   ResponseEntity<Users> response = 
								new ResponseEntity<Users>(users, HttpStatus.OK);
		
		
		return response;
	}
	
	@DeleteMapping("/users/{usersId}")
	public ResponseEntity<Users> delete(@PathVariable Integer usersId) {
		
		Users users = this.usersService.findUsersById(usersId);
		if(users == null)
			throw new UsersNotFoundException("User with id-" + usersId + " not Found");
		
		// send productId to DAO via SERVICE
		this.usersService.deleteUsers(usersId);
		
		ResponseEntity<Users> response = 
				new ResponseEntity<Users>(users, HttpStatus.OK);

		return response;
	}
	
	
	// for exception handling
	@ExceptionHandler  // ~catch
	public ResponseEntity<UsersErrorResponse> productNotFoundHandler(UsersNotFoundException ex) {
		// create error object
		UsersErrorResponse error = new UsersErrorResponse(ex.getMessage(), 
															  HttpStatus.NOT_FOUND.value(), 
															  System.currentTimeMillis());
		ResponseEntity<UsersErrorResponse> response =
										new ResponseEntity<UsersErrorResponse>(error, HttpStatus.NOT_FOUND);
		
		return response;
	}
	
	@ExceptionHandler  // ~catch
	public ResponseEntity<UsersErrorResponse> productOperationErrorHAndler(Exception ex) {
		// create error object
		UsersErrorResponse error = new UsersErrorResponse(ex.getMessage(), 
															  HttpStatus.BAD_REQUEST.value(), 
															  System.currentTimeMillis());
		ResponseEntity<UsersErrorResponse> response =
										new ResponseEntity<UsersErrorResponse>(error, HttpStatus.NOT_FOUND);
		logger.error("Exception :" + error);
		
		return response;
	}
	
	
	
	
	
	
}
