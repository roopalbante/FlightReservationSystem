package com.company.FRS5;

public class Flight {
    //attributes
    private String flightNumber;
    private String airline;
    private int capacity;
    private int bookedSeats;

    //constructor
    public Flight(String flightNumber, String airline, int capacity, int bookedSeats) {
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.capacity = capacity;
        this.bookedSeats = bookedSeats;
    }

    //methods
    public String getFlightDetails(){
        return "Flight number: " + flightNumber + ", Airline: " + airline + ", Capacity: " + capacity + ", Booked Seats: " + bookedSeats;
    }

    public void setFlightDetails(String[] flightDetails, int capacity, int bookedSeats){
        flightNumber = flightDetails[0];
        airline = flightDetails[1];
        this.capacity = capacity;
        this.bookedSeats = bookedSeats;
    }

    boolean checkAvailability(){
        boolean availability = false;
        if(bookedSeats < capacity) {
            availability = true;
        }
        return availability;
    }

    void updateSeats(){
        ++bookedSeats;
    }
}
