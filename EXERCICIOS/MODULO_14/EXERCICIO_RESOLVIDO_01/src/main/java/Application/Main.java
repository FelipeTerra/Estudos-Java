package Application;

import Entities.Reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter the reservation Data: ");
        System.out.print("Room number: ");
        Integer roomNumber = sc.nextInt();
        System.out.print("Check-in date  (dd/MM/yyyy): ");
        Date checkIn = sdf.parse(sc.next());
        System.out.print("Check-out date  (dd/MM/yyyy): ");
        Date checkOut = sdf.parse(sc.next());

        if (!checkOut.after(checkIn)){
            System.out.println("Error in reservation: Check-out date most be after check-in date!");
        }
        else {
            Reservation reservation = new Reservation(roomNumber, checkIn, checkOut);
            System.out.println(reservation);

            System.out.println();
            System.out.println("------------ Update Reservation ------------");
            System.out.println("Enter data to update reservation: ");
            System.out.print("Check-in date  (dd/MM/yyyy): ");
            Date newCheckIn = sdf.parse(sc.next());
            System.out.print("Check-out date  (dd/MM/yyyy): ");
            Date newCheckOut = sdf.parse(sc.next());

            String error = reservation.updateDates(newCheckIn, newCheckOut);
            if ( error != null) {
                System.out.println("Error in reservation: " + error);
            }
            else { System.out.println(reservation); }
        }
        sc.close();
    }
}
