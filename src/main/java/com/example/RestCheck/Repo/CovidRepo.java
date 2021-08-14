package com.example.RestCheck.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.example.RestCheck.POJO.StateCode;



@Repository
public interface CovidRepo extends JpaRepository<StateCode, Integer> {

	void save(ResponseEntity<StateCode> covid);

	
	
			
	
}
