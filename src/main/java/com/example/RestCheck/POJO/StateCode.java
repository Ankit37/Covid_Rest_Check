package com.example.RestCheck.POJO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



@Entity
public class StateCode {
	
	@Id
	@GeneratedValue 
	private int ID;
	
	@Column(name = "State")
	
	private State state;
	
	
}
