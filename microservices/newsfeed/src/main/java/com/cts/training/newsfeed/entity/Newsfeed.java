package com.cts.training.newsfeed.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "newsfeed")

public class Newsfeed {
   
	 @Id
	    private Integer Id;
		
		@Column
		private Integer userId;
		
		@Column
		private Integer mediaId;
		
		@Column
		private String feed;
		
		@CreationTimestamp
		@Column
		private LocalDateTime createdon;
		
		
}
