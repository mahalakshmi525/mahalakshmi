package com.cts.training.actions.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.cts.training.actions.entity.Action;
import com.cts.training.actions.repository.ActionsRepository;

public class ActionController {
	@Autowired
	private ActionsRepository actionsRepository;
	@GetMapping("/actions/{actionId}")
	public ResponseEntity<Action> actionDetail(@PathVariable Integer actionId){
		Optional<Action> record = this.actionsRepository.findById(actionId);
		Action actions = new Action();
		if(record.isPresent())
			actions=record.get();
		ResponseEntity<Action> response = 
								new ResponseEntity<Action>(actions, HttpStatus.OK);
		return response;
		 
	}
}



