package com.matheus.hibernateinheritance;

import java.time.LocalDate;

import javax.persistence.AssociationOverride;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "RETURN_TICKETs")
@AssociationOverride(name = "passenger", joinColumns = @JoinColumn(name = "pass_id"))
public class ReturnTicket extends Ticket{

	private LocalDate latestReturnDate;
	
	public LocalDate getLatestReturnDate() {return latestReturnDate; }

	public void setLatestReturnDate(LocalDate latestReturnDate) {
		this.latestReturnDate = latestReturnDate;
	}
}
