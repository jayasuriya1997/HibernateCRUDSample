package com.truck.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.truck.entity.Truck;
import com.truck.service.TruckService;

@RestController
@RequestMapping("/truck")
public class TruckController {
@Autowired
TruckService truckservice;
@PostMapping("/add")
public String addTruckDetails(@RequestBody Truck truck) {
	return truckservice.addTruckDetails(truck);
}
@GetMapping("/get")
List<Truck>showDetails(){
	return truckservice.showDetails();
	
}
	
}
