package com.cts.training.newsfeed.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.cts.training.newsfeed.entity.Newsfeed;
import com.cts.training.newsfeed.repository.NewsfeedRepository;

public class NewsfeedController {
	@Autowired
	private NewsfeedRepository newsfeedRepository;
	@GetMapping("/newsfeed/{newsfeedId}")
	public ResponseEntity<Newsfeed> actionDetail(@PathVariable Integer newsfeedId){
		Optional<Newsfeed> record = this.newsfeedRepository.findById(newsfeedId);
		Newsfeed newsfeed = new Newsfeed();
		if(record.isPresent())
			newsfeed=record.get();
		ResponseEntity<Newsfeed> response = 
								new ResponseEntity<Newsfeed>(newsfeed, HttpStatus.OK);
		return response;
		 
	}

}
