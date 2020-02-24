package com.cts.training.newsfeed.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.training.newsfeed.entity.Newsfeed;



public interface NewsfeedRepository extends JpaRepository<Newsfeed, Integer>{

}
