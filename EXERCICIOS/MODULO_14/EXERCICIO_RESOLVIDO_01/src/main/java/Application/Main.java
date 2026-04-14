package Application;

import Entities.Reservation;
import Exceptions.DomainException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.println("Enter the reservation Data: ");
            System.out.print("Room number: ");
            Integer roomNumber = sc.nextInt();
            System.out.print("Check-in date  (dd/MM/yyyy): ");
            Date checkIn = sdf.parse(sc.next());
            System.out.print("Check-out date  (dd/MM/yyyy): ");
            Date checkOut = sdf.parse(sc.next());

            Reservation reservation = new Reservation(roomNumber, checkIn, checkOut);
            System.out.println(reservation);

            System.out.println();
            System.out.println("------------ Update Reservation ------------");
            System.out.println("Enter data to update reservation: ");
            System.out.print("Check-in date  (dd/MM/yyyy): ");
            checkIn = sdf.parse(sc.next());
            System.out.print("Check-out date  (dd/MM/yyyy): ");
            checkOut = sdf.parse(sc.next());
            reservation.updateDates(checkIn, checkOut);
            System.out.println(reservation);
        }
        catch (ParseException pe){
            System.out.println("Invalid Date format");
        }
        catch (DomainException e){
            System.out.println("Error in reservation: " + e.getMessage());
        }
        catch (RuntimeException rt){
            System.out.println("Unexpected error!");
        }
        sc.close();
    }
}
