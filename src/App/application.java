package App;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.reservation;

public class application {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Room number: ");
		int number = sc.nextInt();
		System.out.print("Check-in date dd/mm/yyyy: ");
		Date checkin = sdf.parse(sc.next());
		System.out.print("Check-out date dd/mm/yyyy: ");
		Date checkOut = sdf.parse(sc.next());
		
		if(!checkOut.after(checkin)) {
			System.out.println("Error: a data tenq ser maior que a do checgin.");
		}
		else {
			reservation reserv = new reservation(number, checkin, checkOut);
			System.out.println("Reservation: " +reserv);
			
			System.out.println();
			System.out.println("Enter Date to update the reservation:");
			System.out.print("Check-in date dd/mm/yyyy: ");
			checkin = sdf.parse(sc.next());
			System.out.print("Check-out date dd/mm/yyyy: ");
			checkOut = sdf.parse(sc.next());	
			
			String error = reserv.update(checkin, checkOut);
			if(error != null ) {
				System.out.println("Error in reservation: " +error);
			}
			System.out.println("Reservation: " +reserv);
		}
		
		
		sc.close();
	}

}
