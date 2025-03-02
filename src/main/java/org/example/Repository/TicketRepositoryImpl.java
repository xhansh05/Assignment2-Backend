package org.example.Repository;
import org.example.Ticket;
import org.springframework.stereotype.Repository;
import java.util.HashMap;
import java.util.Map;

@Repository

public class TicketRepositoryImpl implements TicketRepository {
    private final Map<String, Ticket> ticketStore = new HashMap<>();
    @Override
    public void saveTicket(String movieName, double price) {
        ticketStore.put(movieName, new Ticket(movieName, price));
    }

    @Override
    public Map<String, Ticket> getAllTickets() {
        return ticketStore;
    }




}
