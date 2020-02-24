package com.cts.training.media.entity;

import java.time.LocalDateTime;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Table(name = "media")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Media {
	
	@Id
	
    private Integer Id;

	
	@Column
	private Integer userId;
	
	@Column
	private String title;
	
	@Column
	private String description;
	
	@Column
	private String mimetype;
	
	@Column
	private Integer size;
	
	
	
	@Column
	private String Posterfileurl;
	
	@Column
	private String fileurl;
	
	@Column
	private boolean hide;
	
	@CreationTimestamp
	@Column
	private LocalDateTime createdon;
	
	@UpdateTimestamp
	@Column
	private LocalDateTime updatedon;
	
	@Column
	private String tags;

	
	
	

}
