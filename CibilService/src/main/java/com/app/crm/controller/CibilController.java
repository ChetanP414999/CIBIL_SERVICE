package com.app.crm.controller;

import java.util.Random;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CibilController {


	
	@GetMapping("/generateCibil")
	public ResponseEntity<Integer> onSaveCustomerDetails(){
		
		
		Random random=new  Random();
	 int cibil=	random.nextInt(601)+300;
		
		return new ResponseEntity<Integer>(cibil,HttpStatus.CREATED);
		
		
	
	}

	
	
}
