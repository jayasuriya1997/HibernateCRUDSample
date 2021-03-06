package com.truck.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.truck.dao.TruckDao;
import com.truck.entity.Truck;
@Service
public class TruckService {
@Autowired
TruckDao  truckdao;
	public String addTruckDetails(Truck truck) {
		
		return truckdao.addTruckDetails(truck);
	}
	public List<Truck> showDetails() {
		return truckdao.showDetails() ;
	}

}
