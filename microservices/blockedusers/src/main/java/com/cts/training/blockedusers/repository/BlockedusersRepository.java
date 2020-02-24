package com.cts.training.blockedusers.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.training.blockedusers.entity.Blockedusers;



public interface BlockedusersRepository extends JpaRepository<Blockedusers, Integer> {

}
