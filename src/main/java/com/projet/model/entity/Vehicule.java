package com.projet.model.entity;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.TableGenerator;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@TableGenerator(name = "Vehicule_gen", table = "Id_GEN",allocationSize = 1)
@DiscriminatorColumn(name = "type")

public class Vehicule {
@Id
long IdVehicule;
String manifucturer;
public long getIdVehicule() {
	return IdVehicule;
}
public void setIdVehicule(long idVehicule) {
	IdVehicule = idVehicule;
}
public String getManifucturer() {
	return manifucturer;
}
public void setManifucturer(String manifucturer) {
	this.manifucturer = manifucturer;
}



}
