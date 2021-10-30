package com.projet.model.entity;

import javax.persistence.Entity;

@Entity
public class Truck extends Transportation {
int noOfContainers;

public int getNoOfContainers() {
	return noOfContainers;
}

public void setNoOfContainers(int noOfContainers) {
	this.noOfContainers = noOfContainers;
}





}
