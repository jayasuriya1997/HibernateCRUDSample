package com.truck.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Truck {
@Autowired
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private	int tid;
private	int marker;
private	String model;
private	String isLongTrailer;
private	int wheelCount;
private	float dryWeight;
public int getTid() {
	return tid;
}
public int getMarker() {
	return marker;
}
public String getModel() {
	return model;
}
public String getIsLongTrailer() {
	return isLongTrailer;
}
public int getWheelCount() {
	return wheelCount;
}
public float getDryWeight() {
	return dryWeight;
}
public void setTid(int tid) {
	this.tid = tid;
}
public void setMarker(int marker) {
	this.marker = marker;
}
public void setModel(String model) {
	this.model = model;
}
public void setIsLongTrailer(String isLongTrailer) {
	this.isLongTrailer = isLongTrailer;
}
public void setWheelCount(int wheelCount) {
	this.wheelCount = wheelCount;
}
public void setDryWeight(float dryWeight) {
	this.dryWeight = dryWeight;
}
	
	
	
	
}
