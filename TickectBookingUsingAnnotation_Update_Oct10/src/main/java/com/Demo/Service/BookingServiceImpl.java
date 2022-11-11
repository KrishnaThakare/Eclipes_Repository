package com.Demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Demo.Dao.BookingDao;
import com.Demo.entities.Ticket;

@Component("bookingService")
public class BookingServiceImpl implements BookingService {

	@Autowired
	BookingDao bookingDao;

	public String bookService(Ticket ticket) {

		bookingDao.bookTicket(ticket);

		return "Ticket Booked Successfully";
	}

	public List<Ticket> getTickets() {
		return bookingDao.getTicket();
	}
}
