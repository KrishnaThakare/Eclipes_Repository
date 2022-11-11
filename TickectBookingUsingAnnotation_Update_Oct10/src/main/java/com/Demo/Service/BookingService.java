package com.Demo.Service;

import java.util.List;

import com.Demo.entities.Ticket;

public interface BookingService {

	public String bookService(Ticket ticket);

	public List<Ticket> getTickets();
}