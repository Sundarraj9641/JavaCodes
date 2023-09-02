package BusReservation;
import java.util.ArrayList;
import java.util.*;
public class busRes {
	public static void main(String[] args) {
		//creating arraylist to store the various number of bus objects
		ArrayList <bus> buses = new ArrayList <bus>();
		
		buses.add(new bus(1,true,10));     //adding bus object to the arraylist
		buses.add(new bus(2,false,2));
		buses.add(new bus(4,true,22));
		buses.add(new bus(7,false,30));
		
		//calling DisplayInfo method using all bus object in "buses" ArrayList
		for(bus b : buses) {		
			b.DisplayInfo();
		}
		
		//creating arraylist for booking
		ArrayList <booking> bookings = new ArrayList <booking>();
		
	
		
		int in = 1;
		while(in==1) {
			System.out.println("Enter 1 for booking \n      2 for exit");
			Scanner sc = new Scanner(System.in);
				in = sc.nextInt();
			
			if(in==1) {
				
				//creating object for booking
				booking booking = new booking();
				
				if(booking.isAvailable(bookings,buses )) {		//if seats available in that bus booking the ticket
					bookings.add(booking);
					System.out.println("Your Booking is Confimed");
				}else {
					System.out.println("Sorry. Bus is Full. Try another bus or date");
				}
			} 
			
			}
		
		
	}

}
