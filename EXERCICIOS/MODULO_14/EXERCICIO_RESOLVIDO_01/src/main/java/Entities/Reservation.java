package Entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Reservation {
    private Integer roomNumber;
    private Date checkin;
    private Date checkout;

    private final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reservation (){}

    public Reservation( Integer roomNumber, Date checkin, Date checkout){
        this.roomNumber = roomNumber;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public Integer getRoomNumber() { return roomNumber; }
    public void setRoomNumber(Integer roomNumber) { this.roomNumber = roomNumber; }

    public Date getCheckin() { return checkin; }
    public void setCheckin(Date checkin) { this.checkin = checkin; }

    public Date getCheckout() { return checkout; }
    public void setCheckout(Date checkout) { this.checkout = checkout; }

    public Integer duration(){
        Integer days = ;
        return days;
    }

    public void updateDates(Date checkin, Date checkout){
        this.checkin = checkin;
        this.checkout = checkout;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Reservation: ").append(getRoomNumber())
                .append(", Check-in: ").append(sdf.format(getCheckin()))
                .append(", Check-out: ").append(sdf.format(getCheckout()))
                .append(", ").append(duration()).append(" nights");
        return sb.toString();
    }
}
