package accolite;

public class Ticket {
	int noOfTickets=10;
	public synchronized void checkAvailability(String name,int no) {
		if(no<=noOfTickets) {
			System.out.println("Congratulations! "+name+" your tickets have been booked successfully");
			noOfTickets-=no;
		}
		else {
			System.out.println("Sorry "+name+"  No ticket available");
		}
	}
}
