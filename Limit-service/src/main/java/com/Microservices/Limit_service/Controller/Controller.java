package com.Microservices.Limit_service.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Microservices.Limit_service.Model.Limits;
import com.Microservices.Limit_service.configuration.Configuration;


@RestController
@RequestMapping("/")
public class Controller {
	
	@Autowired
	private Configuration config;
	
	@GetMapping("limits/")
	public Limits test() {
		return new Limits(config.getMin(),config.getMax());
	}

}
