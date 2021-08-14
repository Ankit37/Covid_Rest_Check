package com.example.RestCheck.POJO;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity 
public class Meta {

	@Id
	@GeneratedValue
	private Integer id;
	
	private Date last_updated;
	private Long population;
	private Tested tested;
	private String notes;
	public Date getLast_updated() {
		return last_updated;
	}
	public void setLast_updated(Date last_updated) {
		this.last_updated = last_updated;
	}
	public Long getPopulation() {
		return population;
	}
	public void setPopulation(Long population) {
		this.population = population;
	}
	public Tested getTested() {
		return tested;
	}
	public void setTested(Tested tested) {
		this.tested = tested;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	
	
	
}
