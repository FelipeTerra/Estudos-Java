package Entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
    private Integer roomNumber;
    private Date checkIn;
    private Date checkOut;

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reservation (){}

    public Reservation(Integer roomNumber, Date checkIn, Date checkOut){
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getRoomNumber() { return roomNumber; }
    public void setRoomNumber(Integer roomNumber) { this.roomNumber = roomNumber; }

    public Date getCheckIn() { return checkIn; }

    public Date getCheckOut() { return checkOut; }

    public long duration(){
        long diff = checkOut.getTime() - checkIn.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }

    public void updateDates(Date checkin, Date checkout){
        this.checkIn = checkin;
        this.checkOut = checkout;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Reservation: Room ").append(getRoomNumber())
                .append(", Check-in: ").append(sdf.format(getCheckIn()))
                .append(", Check-out: ").append(sdf.format(getCheckOut()))
                .append(", ").append(duration()).append(" nights");
        return sb.toString();
    }
}
