package com.example.RestCheck.POJO;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Tested {

	@Id
	@GeneratedValue
	private Integer id;
	private Date last_updated;
	private String source;
	public Date getLast_updated() {
		return last_updated;
	}
	public void setLast_updated(Date last_updated) {
		this.last_updated = last_updated;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	
	
	
}
