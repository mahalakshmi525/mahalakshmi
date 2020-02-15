package com.cts.training.mavenweb.entity;

import java.time.LocalDateTime;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;

@Table(name = "media")
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

	
	
	public Media() {}
	
public Media(Integer id, Integer userid, String title,String description,String mimetype,Integer size,String Posterfileurl,String fileurl,LocalDateTime createdon,LocalDateTime updatedon , String tags) {
		
		this.Id = id;
		this.userId = userId;
		this.title= title;
		this.description = description;
		this.mimetype = mimetype;
		this.size=size;
		this.Posterfileurl=Posterfileurl;
		this.createdon= createdon;
		this.updatedon= updatedon;
		this.tags= tags;
	}

public Integer getId() {
	return Id;
}

public void setId(Integer id) {
	Id = id;
}

public Integer getUserid() {
	return userId;
}

public void setUserid(Integer userid) {
	this.userId = userId;
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public String getMimetype() {
	return mimetype;
}

public void setMimetype(String mimetype) {
	this.mimetype = mimetype;
}

public Integer getSize() {
	return size;
}

public void setSize(Integer size) {
	this.size = size;
}

public String getPosterfileurl() {
	return Posterfileurl;
}

public void setPosterfileurl(String posterfileurl) {
	Posterfileurl = posterfileurl;
}

public String getFileurl() {
	return fileurl;
}

public void setFileurl(String fileurl) {
	this.fileurl = fileurl;
}

public boolean isHide() {
	return hide;
}

public void setHide(boolean hide) {
	this.hide = hide;
}

public LocalDateTime getCreatedon() {
	return createdon;
}

public void setCreatedon(LocalDateTime createdon) {
	this.createdon = createdon;
}

public LocalDateTime getUpdatedon() {
	return updatedon;
}

public void setUpdatedon(LocalDateTime updatedon) {
	this.updatedon = updatedon;
}

public String getTags() {
	return tags;
}

public void setTags(String tags) {
	this.tags = tags;
}
@Override
public String toString() {
	return "Student [id=" + Id + ", userid=" + userId + ", description=" + description +", mimetype=" + mimetype + ",size=" + size + ", posterfileurl="+ Posterfileurl +",fielurl="+ fileurl+" , hide="+ hide +",createdon=" + createdon +", updatedon=" + updatedon + ", tags=" + tags + "]";
}

}
