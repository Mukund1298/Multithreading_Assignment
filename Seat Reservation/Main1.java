package accolite;

public class Main1 {
public static void main(String[] args) {
	Ticket t=new Ticket();
	Person p1=new Person(t,"Mukund",3);
	Person p2=new Person(t,"Ramesh",4);
	Person p3=new Person(t,"Mahesh",2);
	Person p4=new Person(t,"Dinesh",2);
	p1.start();
	p2.start();
	p3.start();
	p4.start();
}
}
