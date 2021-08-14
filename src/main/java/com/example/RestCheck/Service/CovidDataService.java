package com.example.RestCheck.Service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import com.example.RestCheck.POJO.StateCode;
import com.example.RestCheck.Repo.CovidRepo;

@Service
public class CovidDataService {

	@Autowired
	private CovidRepo covidRepo;
	

	public HttpStatus DataSave() {
		ResponseEntity<StateCode> covid = new RestTemplate()
				.getForEntity("https://api.covid19india.org/v4/min/data.min.json", StateCode.class);
		covidRepo.save(covid);
		return HttpStatus.ACCEPTED;

	}

}
