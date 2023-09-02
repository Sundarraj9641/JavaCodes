package BusReservation;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;  //build in class to convert string into date
public class booking {
	String passengerName;    	//instance variables
	int busNo;
	Date date;
	
	booking(){				//constructor
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name");    //get name from the user
		passengerName = sc.next();			//store the name
		System.out.println("Enter Bus No");
		busNo = sc.nextInt();
		System.out.println("Enter the date of Traveling dd/mm/yyyy in this format");
		String dateInStr = sc.next();		//get name in string format
		
		//creating object to build in class
		SimpleDateFormat  df = new SimpleDateFormat("dd/MM/yyyy");
		
		//assign converted date to the instance variable "date"
		try {
			date = df.parse(dateInStr);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
		public  boolean isAvailable(ArrayList<booking> bookings, ArrayList <bus> buses) {
			int capacity =0;
			for(bus b : buses) {
				if(b.getBusNo()== busNo) {			//check the totalSeats of the bus
					capacity = b.getTotalSeats();
				}
			}
			int booked = 0;
			for(booking b : bookings) {
				if(b.busNo == busNo && b.date.equals(date) ) {  		//check seats availability
					booked++;
				}
			}
			return booked<capacity?true:false;
		}
}
