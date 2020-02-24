package com.cts.training.followers.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.training.followers.entity.Followers;


public interface FollowersRepository extends JpaRepository<Followers, Integer> {

}
