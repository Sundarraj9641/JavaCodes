package BusReservation;

public class bus {
	private int busNo;    //instance variables of bus class
	private boolean ac;
	private int totalSeats;
	
	bus(int busNo, boolean ac, int totalSeats){    //constructor
		this.busNo =busNo;
		this.ac=ac;
		this.totalSeats = totalSeats;
	}
	
	//to access the instance variable (private) getters and setter are used
	int getBusNo(){				//getter -- because of instance variables are private
		return busNo;
	}
	void setBusNo(int busNo){	//setter -- because of instance variables are private
		this.busNo = busNo;
	}
	
	boolean getAc(){   			//getter return the value
		return ac;
	}
	void setAc(boolean ac){		//setter allow to set the value
		this.ac = ac;
	}
	
	int getTotalSeats(){
		return totalSeats;
	}
	void setTotalSeats(int totalSeats){
		this.totalSeats = totalSeats;
	}
	
	//method to display the details of the bus
	public void DisplayInfo(){
		System.out.println("Bus No :" + busNo + "   "+ "Ac :" + ac + "   "+ "TotalSeats :" + totalSeats);
	}

}
