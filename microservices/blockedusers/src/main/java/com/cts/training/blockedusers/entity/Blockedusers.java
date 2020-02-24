package com.cts.training.blockedusers.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

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
@Table(name = "blockedusers")

public class Blockedusers {
	

	@Column
	private Integer userId;
	

	@Column
	private Integer blockeduserId;
	

	
}
