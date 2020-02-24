package com.cts.training.comments.entity;

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

@Table(name = "comments")

public class Comments {
	
    @Id
    private Integer Id;

	@Column
	private Integer mediaId;
	
	@Column
	private Integer userId;
	
	@Column
	private String comment;
	
	@CreationTimestamp
	@Column
	private LocalDateTime createdon;
	
	
}
