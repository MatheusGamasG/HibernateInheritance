package com.matheus.hibernateinheritance;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Execute {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.matheus.hibernateinheritance");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Passenger matheus = new Passenger("Matheus Guimarães");
		
		OneWayTicket oneWayTicket = new OneWayTicket();
		oneWayTicket.setNumber("AABBCC");
		oneWayTicket.setLatestDepartureDate(LocalDate.of(2021, 5, 24));
		oneWayTicket.setPassenger(matheus);
		
		ReturnTicket returnTicket = new ReturnTicket();
		returnTicket.setNumber("DDEEFF");
		returnTicket.setLatestReturnDate(LocalDate.of(2020, 4, 13));
		returnTicket.setPassenger(matheus);
		
		em.persist(matheus);
		em.persist(oneWayTicket);
		em.persist(returnTicket);
		
		
		
		em.getTransaction().commit();		
		em.close();
	}

}
