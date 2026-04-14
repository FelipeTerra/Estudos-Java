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

    public String updateDates(Date checkIn, Date checkOut){
        //fazendo o tratamento dentro da própria classe de Reserva, fazendo a delegação correta para este tipo de tratamento
        Date now = new Date();
        if ( checkIn.before(now) || checkOut.before(now) ){
            return "Reservation dates for update must be future dates!";
        }
        if ( !checkOut.after(checkIn) ) {
            return "Check-out date most be after check-in date!";
        }
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        return null;
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
