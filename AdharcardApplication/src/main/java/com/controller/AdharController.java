package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/adhar")

public class AdharController {
@Autowired
AdharService adharservice;
public String addDetails(@RequestBody Adhar adhar) {
	
	return 
}
	
}
