package com.cts.training.actions.entity;

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
@Table(name = "action")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString


public class Action {
	
	 @Id
	    private Integer Id;

		@Column
		private Integer mediaId;
		
		@Column
		private Integer userId;
		
		@Column
		private boolean status;
		
		@CreationTimestamp
		@Column
		private LocalDateTime createdon;

		
		
}
