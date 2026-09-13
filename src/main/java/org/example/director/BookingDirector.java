package org.example.director;

import org.example.builder.BookingBuilder;
import org.example.model.Booking;

public class BookingDirector {
    public Booking makeStandardTicket(BookingBuilder builder, String movie, String time, int seat) {
        return builder.setMovieTitle(movie)
                .setScreeningTime(time)
                .setHallType("2D")
                .addSeat(seat)
                .build();
    }
    public Booking makeComboTicket(BookingBuilder builder, String movie, String time, int seat) {
        return builder.setMovieTitle(movie)
                .setScreeningTime(time)
                .setHallType("IMAX")
                .addSeat(seat)
                .addPopcorn()
                .addDrink()
                .build();
    }
}
