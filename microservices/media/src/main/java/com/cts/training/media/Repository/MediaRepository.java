package com.cts.training.media.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.training.media.entity.Media;



public interface MediaRepository extends JpaRepository<Media, Integer> {

}
