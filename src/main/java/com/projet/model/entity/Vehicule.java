package com.projet.model.entity;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.TableGenerator;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@TableGenerator(name = "Vehicule_gen", table = "Id_GEN",allocationSize = 1)
public class Vehicule {

}
