package accolite;

public class Person extends Thread{
	Ticket t;
	String name;
	int no;
	Person(Ticket t,String name,int no){
		this.t=t;
		this.name=name;
		this.no=no;
	}
	public void run() {
		t.checkAvailability(name, no);
	}

}
