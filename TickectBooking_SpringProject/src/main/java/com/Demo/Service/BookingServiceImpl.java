package com.Demo.Service;

import org.springframework.stereotype.Component;

@Component("bookingService")
public class BookingServiceImpl implements BookingService {

	public String bookService() {
		return "Ticket Booked Successfully";
	}

}
