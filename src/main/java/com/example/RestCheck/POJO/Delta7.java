package com.example.RestCheck.POJO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Delta7 {

	
	@Id
	@GeneratedValue
	private Integer id;
	
	@Column(name="confirmed")
	private Long confirmed;
	@Column(name="deceased")
	private Long deceased;
	@Column(name="recovered")
	private Long recovered;
	@Column(name="tested")
	private Long tested;
	@Column(name="vaccinated")
	private Long vaccinated;
	
	public Long getConfirmed() {
		return confirmed;
	}
	public void setConfirmed(Long confirmed) {
		this.confirmed = confirmed;
	}
	public Long getDeceased() {
		return deceased;
	}
	public void setDeceased(Long deceased) {
		this.deceased = deceased;
	}
	public Long getRecovered() {
		return recovered;
	}
	public void setRecovered(Long recovered) {
		this.recovered = recovered;
	}
	public Long getTested() {
		return tested;
	}
	public void setTested(Long tested) {
		this.tested = tested;
	}
	public Long getVaccinated() {
		return vaccinated;
	}
	public void setVaccinated(Long vaccinated) {
		this.vaccinated = vaccinated;
	}
}
