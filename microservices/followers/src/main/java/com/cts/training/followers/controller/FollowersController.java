package com.cts.training.followers.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.cts.training.followers.entity.Followers;
import com.cts.training.followers.repository.FollowersRepository;



public class FollowersController {
	@Autowired
	private FollowersRepository followersRepository;
	@GetMapping("/followers/{followersId}")
	public ResponseEntity<Followers> actionDetail(@PathVariable Integer followersId){
		Optional<Followers> record = this.followersRepository.findById(followersId);
		Followers followers = new Followers();
		if(record.isPresent())
			followers=record.get();
		ResponseEntity<Followers> response = 
								new ResponseEntity<Followers>(followers, HttpStatus.OK);
		return response;
		 
	}

}
