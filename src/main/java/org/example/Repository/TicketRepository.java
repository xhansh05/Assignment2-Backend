package org.example.Repository;

import org.example.Ticket;

import java.util.Map;

public interface TicketRepository {
    void saveTicket(String movieName, double price);
    Map<String, Ticket> getAllTickets();
}
