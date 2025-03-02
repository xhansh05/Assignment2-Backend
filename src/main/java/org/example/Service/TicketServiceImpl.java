package org.example.Service;

import org.example.Repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
@Primary
public class TicketServiceImpl implements TicketService {
    private final TicketRepository ticketRepository;

    @Autowired
    public TicketServiceImpl(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    @Override
    public void bookTicket(String movie, double price) {
        ticketRepository.saveTicket(movie, price);
        System.out.println("Ticket is booked: " + movie + "cost - " + price);
    }

    @Override
    public Map<String, Double> getTickets() {
        Map<String, Double> result = new HashMap<>();
        ticketRepository.getAllTickets().forEach((name, ticket) -> result.put(name, ticket.getPrice()));
        return result;
    }
}
