package com.Demo.Dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.Demo.entities.Ticket;
import com.Demo.util.TicketRowMapper;

@Component("bookingDao")
public class BookingDaoImpl implements BookingDao {

	JdbcTemplate jdbcTemplate;

	public BookingDaoImpl(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public void bookTicket(Ticket ticket) {

		jdbcTemplate.update("insert into tickets values (?,?)", ticket.getTicketId(), ticket.getPassengerName());
	}

	public List<Ticket> getTicket() {

		return jdbcTemplate.query("select * from tickets", new TicketRowMapper());

	}

}
