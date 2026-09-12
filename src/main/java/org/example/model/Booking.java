package org.example.model;
import org.example.builder.BookingBuilder;
import java.util.List;

public class Booking {
    private final String movieTitle;
    private final String screeningTime;
    private final String hallType;
    private final List<Integer> seatNumbers;
    private final boolean hasPopcorn;
    private final boolean hasDrink;
    private final double totalPrice;

    public Booking(BookingBuilder builder) {
        this.movieTitle=builder.getMovieTitle();
        this.screeningTime=builder.getScreeningTime();
        this.hallType=builder.getHallType();
        this.seatNumbers=builder.getSeatNumbers();
        this.hasPopcorn=builder.isHasPopcorn();
        this.hasDrink=builder.isHasDrink();
        this.totalPrice=builder.getTotalPrice();
    }
    public void showTicket() {
        System.out.println("Movie: "+movieTitle);
        System.out.println("Time: "+screeningTime);
        System.out.println("Hall: "+hallType);
        System.out.println("Seats: "+seatNumbers);
        System.out.println("Popcorn: "+(hasPopcorn ? "Yes" : "No"));
        System.out.println("Drink: "+(hasDrink ? "Yes" : "No"));
        System.out.println("Total price: "+totalPrice);
    }
}
