package accolite;

public class account {
public static void main(String[] args) {
	//Available balance is Rs.1000
	debit d=new debit(1500);//withdraw Rs. 1500
	credit c=new credit(1000);//deposit Rs. 1000 more
	c.start();
	d.start();
}
}
