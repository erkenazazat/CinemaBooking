package org.example.builder;

import org.example.model.Booking;

import java.util.ArrayList;
import java.util.List;

public class BookingBuilder {
    private String movieTitle;
    private String screeningTime;
    private String hallType="2D";
    private List<Integer> seatNumbers=new ArrayList<>();
    private boolean hasPopcorn;
    private boolean hasDrink;
    private double totalPrice=0.0;

    public BookingBuilder setMovieTitle(String movieTitle) {
        if (movieTitle==null || movieTitle.isEmpty()) {
            throw new IllegalArgumentException("Movie title cannot be empty.");
        }
        this.movieTitle=movieTitle;
        return this;
    }
    public BookingBuilder setScreeningTime(String screeningTime) {
        if (screeningTime==null || screeningTime.isEmpty()) {
            throw new IllegalArgumentException("Screening time cannot be empty.");
        }
        this.screeningTime=screeningTime;
        return this;
    }
    public BookingBuilder setHallType(String hallType) {
        this.hallType=hallType;
        return this;
    }
    public BookingBuilder addSeat(int seat) {
        if (seat<=0) {
            throw new IllegalArgumentException("Seat number must be valid.");
        }
        this.seatNumbers.add(seat);
        return this;
    }
    public BookingBuilder addPopcorn() {
        this.hasPopcorn=true;
        this.totalPrice+=1500.0;
        return this;
    }
    public BookingBuilder addDrink() {
        this.hasDrink=true;
        this.totalPrice+=800.0;
        return this;
    }
    public Booking build() {
        if (movieTitle==null || movieTitle.isEmpty()) {
            throw new IllegalArgumentException("Error: Movie title is required");
        }
        if (seatNumbers.isEmpty()) {
            throw new IllegalArgumentException("Error: At least one seat must be selected.");
        }
        this.totalPrice+=seatNumbers.size()*2000.0;
        return new Booking(this);
    }
    public String getMovieTitle() { return movieTitle ;}
    public String getScreeningTime() { return screeningTime; }
    public String getHallType() { return hallType; }
    public List<Integer> getSeatNumbers() { return seatNumbers; }
    public boolean isHasPopcorn() { return hasPopcorn; }
    public boolean isHasDrink() { return hasDrink; }
    public double getTotalPrice() { return totalPrice; }
}
