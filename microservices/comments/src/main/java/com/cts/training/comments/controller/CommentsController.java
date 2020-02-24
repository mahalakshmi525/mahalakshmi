package com.cts.training.comments.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.cts.training.comments.entity.Comments;
import com.cts.training.comments.repository.CommentsRepository;


public class CommentsController {
	@Autowired
	private CommentsRepository commentsRepository;
	@GetMapping("/comments/{commentId}")
	public ResponseEntity<Comments> actionDetail(@PathVariable Integer commentId){
		Optional<Comments> record = this.commentsRepository.findById(commentId);
		Comments comments = new Comments();
		if(record.isPresent())
			comments=record.get();
		ResponseEntity<Comments> response = 
								new ResponseEntity<Comments>(comments, HttpStatus.OK);
		return response;
		 
	}


}
