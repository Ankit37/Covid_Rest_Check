package com.example.RestCheck.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



import com.example.RestCheck.Service.CovidDataService;

@RestController
public class FirstController {
	@Autowired 
	private CovidDataService covidService;
	
	
	
	@GetMapping("/fetchApi")
	public HttpStatus getData()
	{
		return covidService.DataSave();
		
	}
}
