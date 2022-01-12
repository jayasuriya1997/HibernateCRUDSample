package com.truck.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.truck.entity.Truck;
import com.truck.repository.TruckRepository;

@Repository
public class TruckDao {
@Autowired
TruckRepository  truckrepository ;

public String addTruckDetails(Truck truck) {
	truckrepository.save(truck);
	return "sucess";
}

public List<Truck> showDetails() {
List<Truck> t=	truckrepository.findAll();
	return t;
}


}
