package com.projet.model.entity;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Passenger extends Vehicule {
int noOfPassenger;

public int getNoOfPassenger() {
	return noOfPassenger;
}

public void setNoOfPassenger(int noOfPassenger) {
	this.noOfPassenger = noOfPassenger;
}




}
