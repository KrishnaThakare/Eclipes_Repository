package com.Demo.App;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.Demo.Service.BookingService;
import com.Demo.entities.Ticket;

@ComponentScan(basePackages = "com.Demo")
public class MyApp {

	public static void main(String[] args) {

		System.out.println("Welcom To Our Tour service");

		AnnotationConfigApplicationContext acac = new AnnotationConfigApplicationContext(MyApp.class);

		BookingService bookService = acac.getBean("bookingService", BookingService.class);

		Ticket ticket = new Ticket();
		ticket.setTicketId(59);
		ticket.setPassengerName("Shridhar");

		System.out.println("Booking Status: " + bookService.bookService(ticket));

		List<Ticket> ticketList = bookService.getTickets();

		for (Ticket tickets : ticketList) {
			System.out.println("Ticket Details ==> " + tickets.getTicketId() + "  " + tickets.getPassengerName());
		}

		acac.close();
	}

}
