package com.example.RestCheck.POJO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Total")
public class Total {

	@Id
	@GeneratedValue
	private Integer id;
	@Column(name = "Confirmed")
	private Long confirmed;
	
	@Column(name="Deceased")
	private Long deceased;
	
	@Column(name = "Recovered")
	private Long recovered;
	private Long tested;
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
