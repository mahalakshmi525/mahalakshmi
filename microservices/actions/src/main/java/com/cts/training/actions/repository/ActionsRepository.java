package com.cts.training.actions.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.training.actions.entity.Action;

public interface ActionsRepository extends JpaRepository<Action, Integer> {

}
