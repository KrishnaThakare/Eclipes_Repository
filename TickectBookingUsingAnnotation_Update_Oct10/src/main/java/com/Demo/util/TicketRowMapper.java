package com.Demo.util;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.Demo.entities.Ticket;

public class TicketRowMapper implements RowMapper<Ticket> {

	public Ticket mapRow(ResultSet rs, int rowNum) throws SQLException {

		Ticket ticket = new Ticket();

		ticket.setTicketId(rs.getInt("ticket_id"));
		ticket.setPassengerName(rs.getString("passenger_name"));

		return ticket;
	}

}
