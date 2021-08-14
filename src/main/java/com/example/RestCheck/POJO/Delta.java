package com.example.RestCheck.POJO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Delta {

	@Id
	@GeneratedValue
	private Integer id;
	
	@Column(name="Confirmed")
	private Long confirmed;
	@Column(name="Deceased")
	private Long deceased;
	@Column(name="Recovered")
	private Long recovered;
	@Column(name="Vaccinated")
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
	public Long getVaccinated() {
		return vaccinated;
	}
	public void setVaccinated(Long vaccinated) {
		this.vaccinated = vaccinated;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	
	
	
	
	
}
