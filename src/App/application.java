package App;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.reservation;
import prova.DomainException;

public class application {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			System.out.print("Room number: ");
			int number = sc.nextInt();
			System.out.print("Check-in date dd/mm/yyyy: ");
			Date checkin = sdf.parse(sc.next());
			System.out.print("Check-out date dd/mm/yyyy: ");
			Date checkOut = sdf.parse(sc.next());
			
			reservation reserv = new reservation(number, checkin, checkOut);
			System.out.println("Reservation: " +reserv);
			
			System.out.println();
			System.out.println("Enter Date to update the reservation:");
			System.out.print("Check-in date dd/mm/yyyy: ");
			checkin = sdf.parse(sc.next());
			System.out.print("Check-out date dd/mm/yyyy: ");
			checkOut = sdf.parse(sc.next());	
			
			reserv.update(checkin, checkOut);
			System.out.println("Reservation: " +reserv);
		}
		catch(ParseException f){
			System.out.println("Invalide date format");
		}
		catch(DomainException p) {
			System.out.println("Error in reservation: " +p.getMessage());
		}
		catch(RuntimeException a) {
			System.out.println("Unexpectd error");
		}
		
		sc.close();
	}

}
