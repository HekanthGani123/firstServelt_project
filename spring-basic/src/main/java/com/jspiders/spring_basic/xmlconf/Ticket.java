package com.jspiders.spring_basic.xmlconf;

public class Ticket {
	
	private String ticketNumber;
	private String form;
	private String destination;
	private Passenger passenger;
	
	public Ticket() {
		System.out.println(this.getClass().getSimpleName()+" object created");
	}
	public String getTicketNumber() {
		return ticketNumber;
	}
	public void setTicketNumber(String ticketNumber) {
		this.ticketNumber = ticketNumber;
	}
	public String getForm() {
		return form;
	}
	public void setForm(String form) {
		this.form = form;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	@Override
	public String toString() {
		return "Ticket [ticketNumber=" + ticketNumber + ", form=" + form + ", destination=" + destination + "]";
	}
	public Passenger getPassenger() {
		return passenger;
	}
	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}

}
