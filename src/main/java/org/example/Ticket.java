package org.example;

public class Ticket {
    private double price;
    private String movieName;


    public double getPrice() {

        return price;
    }

    public void setPrice(double price) {

        this.price = price;
    }

    public String getMovieName() {

        return movieName;
    }

    public void setMovieName(String movieName) {

        movieName = movieName;
    }
    public Ticket(String movieName, double price) {
        this.movieName = movieName;
        this.price = price;
    }



}
