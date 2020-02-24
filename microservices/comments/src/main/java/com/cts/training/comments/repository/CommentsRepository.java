package com.cts.training.comments.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.training.comments.entity.Comments;


public interface CommentsRepository extends JpaRepository<Comments, Integer> {

}
