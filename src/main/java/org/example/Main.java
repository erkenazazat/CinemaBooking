package org.example;

import org.example.builder.BookingBuilder;
import org.example.director.BookingDirector;
import org.example.model.Booking;

public class Main {
    public static void main(String[] args) {
        Booking myTicket=new BookingBuilder()
                .setMovieTitle("Harry Potter")
                .setScreeningTime("20:00")
                .setHallType("IMAX")
                .addSeat(3)
                .addPopcorn()
                .build();

        myTicket.showTicket();

        BookingDirector director = new BookingDirector();
        Booking comboTicket=director.makeComboTicket(new BookingBuilder(), "Avatar", "18:00", 7);
        comboTicket.showTicket();
    }
}