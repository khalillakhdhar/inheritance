package com.projet.model.entity;

import javax.persistence.Entity;

@Entity
public class Car extends Passenger {
int noOfDoors;

public int getNoOfDoors() {
	return noOfDoors;
}

public void setNoOfDoors(int noOfDoors) {
	this.noOfDoors = noOfDoors;
}


}
