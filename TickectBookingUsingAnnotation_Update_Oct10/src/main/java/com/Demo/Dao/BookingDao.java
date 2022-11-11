package com.Demo.Dao;

import java.util.List;

import com.Demo.entities.Ticket;

public interface BookingDao {

	public void bookTicket(Ticket ticket);

	public List<Ticket> getTicket();
}
