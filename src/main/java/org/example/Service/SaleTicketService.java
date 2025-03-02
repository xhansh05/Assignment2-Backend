package org.example.Service;

import org.example.Repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
@Qualifier("saleTicketService")
public class SaleTicketService implements TicketService {
    private final TicketRepository ticketRepository;

    @Autowired
    public SaleTicketService(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    @Override
    public void bookTicket(String movie, double price) {
        double SellOutPrice = price * 0.9;
        ticketRepository.saveTicket(movie,SellOutPrice);
        System.out.println("Ticket with sell-out is booked: " + movie + "cost - " + SellOutPrice);
    }

    @Override
    public Map<String, Double> getTickets() {
        Map<String, Double> result = new HashMap<>();
        ticketRepository.getAllTickets().forEach((name, ticket) -> result.put(name, ticket.getPrice()));
        return result;
    }
}
