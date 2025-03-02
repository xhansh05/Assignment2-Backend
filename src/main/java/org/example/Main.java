package org.example;

import org.example.Service.TicketService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        //Call lazy component
        ProjectConfig.LazySingleton lazyBean = context.getBean(ProjectConfig.LazySingleton.class);

        TicketService standardService = context.getBean(TicketService.class);

        TicketService sellOutService = context.getBean("saleTicketService", TicketService.class);

        standardService.bookTicket("Steven Universe", 10.00);
        sellOutService.bookTicket("Hobbit 4", 9.55);


        System.out.println("Booked tickets here: " + standardService.getTickets());

    }
    }
