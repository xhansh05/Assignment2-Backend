package org.example.Service;

import java.util.Map;

public interface TicketService {
    void bookTicket(String movie, double price);
    Map<String, Double> getTickets();
}
