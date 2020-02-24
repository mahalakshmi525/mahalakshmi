package com.cts.training.media.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.cts.training.media.Repository.MediaRepository;
import com.cts.training.media.entity.Media;


public class MediaController {
	@Autowired
	private MediaRepository mediaRepository;
	@GetMapping("/media/{mediaId}")
	public ResponseEntity<Media> actionDetail(@PathVariable Integer mediaId){
		Optional<Media> record = this.mediaRepository.findById(mediaId);
		Media media = new Media();
		if(record.isPresent())
			media=record.get();
		ResponseEntity<Media> response = 
								new ResponseEntity<Media>(media, HttpStatus.OK);
		return response;
		 
	}

}
