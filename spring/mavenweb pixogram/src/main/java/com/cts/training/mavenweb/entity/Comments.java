package com.cts.training.mavenweb.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

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
	
	@Column
	private LocalDateTime createdon;
	
	public  Comments() {}
	
	public Comments(Integer id, Integer mediaId,Integer userId, String comment,LocalDateTime createdon) {
			
			this.Id = id;
			this.mediaId=mediaId;
			this.userId = userId;
			this.comment=comment;
			this.createdon= createdon;
			
		}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public Integer getMediaId() {
		return mediaId;
	}

	public void setMediaId(Integer mediaId) {
		this.mediaId = mediaId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public LocalDateTime getCreatedon() {
		return createdon;
	}

	public void setCreatedon(LocalDateTime createdon) {
		this.createdon = createdon;
	}

	@Override
	public String toString() {
		return "Student [id=" + Id + ", mediaid=" + mediaId + ",userid=" + userId +", comment=" + comment + ", createdon=" + createdon +"]";
	}

}
