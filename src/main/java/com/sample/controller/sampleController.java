package com.sample.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class sampleController {
	
	@GetMapping("/sample")
	ResponseEntity<?> sayHello(){
		return new ResponseEntity<String>("Hi Riya Vashistha",HttpStatus.OK);
	}
	
	@GetMapping("/viewAll")
	ResponseEntity<?> viewAll(){
		return new ResponseEntity<String>("We are doind aws CI/CD",HttpStatus.OK);
	}

}
