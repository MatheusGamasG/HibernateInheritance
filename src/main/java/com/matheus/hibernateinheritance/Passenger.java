package com.matheus.hibernateinheritance;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "passengers")
public class Passenger {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	
	public Passenger(String name) {
		this.name = name;
	}
	
	public Passenger() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
