package com.cts.training.blockedusers.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.cts.training.blockedusers.entity.Blockedusers;
import com.cts.training.blockedusers.repository.BlockedusersRepository;


public class BlockedusersController {
	@Autowired
	private BlockedusersRepository blockedusersRepository;
	@GetMapping("/blockedusers/{blockeduserId}")
	public ResponseEntity<Blockedusers> actionDetail(@PathVariable Integer blockeduserId){
		Optional<Blockedusers> record = this.blockedusersRepository.findById(blockeduserId);
		Blockedusers blockedusers = new Blockedusers();
		if(record.isPresent())
			blockedusers=record.get();
		ResponseEntity<Blockedusers> response = 
								new ResponseEntity<Blockedusers>(blockedusers, HttpStatus.OK);
		return response;
		 
	}


}
