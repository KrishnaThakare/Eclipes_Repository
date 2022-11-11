package com.Demo.App;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import com.Demo.Service.BookingService;

@ComponentScan(basePackages = "com.Demo")
public class MyApp {

	public static void main(String[] args) {

		System.out.println("Welcom To Our Tour service");

		AnnotationConfigApplicationContext acac = new AnnotationConfigApplicationContext();

		acac.register(MyApp.class);
		acac.refresh();

		System.out.println();

		BookingService bookService = acac.getBean("bookingService", BookingService.class);

		System.out.println("Booking Status: " + bookService.bookService());

		acac.close();
	}

}
