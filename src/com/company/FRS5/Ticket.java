package com.company.FRS5;

//public class Ticket {
//}
public abstract class Ticket {

    //attributes
    private String pnr;
    private String from;
    private String to;
    private String departureDateTime;
    private String arrivalDateTime;
    private String seatNo;
    private float price;
    private boolean cancelled;

    //aggregation attributes
    private Flight flight;
    private Passenger passenger;

    //constructor
    public Ticket(String pnr, String from, String to,  String departureDateTime, String arrivalDateTime, String seatNo, float price, boolean cancelled, String flightNumber, String airline, int capacity, int bookedSeats, String street, String city, String state, String name, String phone, String email) {
        this.pnr = pnr;
        this.from = from;
        this.to = to;
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
        this.seatNo = seatNo;
        this.price = price;
        this.cancelled = cancelled;

        Flight flight = new Flight(flightNumber, airline, capacity, bookedSeats);
        this.flight = flight;

        Passenger passenger = new Passenger(street, city, state, name, phone, email);
        this.passenger = passenger;

    }

    //methods
    public String checkStatus(){
        String status;
        if(cancelled){
            status = "Cancelled";
        }
        else{
            status = "Confirmed";
        }
        return status;
    }

    public int calDuration(){
        int duration = 0;
        return duration;
    }

    public void ticketCancel(){
        cancelled = true;
    }

    public static void printDetails(Ticket ticket){
        //System.out.println("PNR: " + ticket.getPnr());
    }
}

