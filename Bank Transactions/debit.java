package accolite;

public class debit extends Thread {
	int bal;
	debit(int bal){
		this.bal=bal;
	}
	public void run() {
		credit c=new credit();
		if(bal>c.bal) {
			synchronized(c) {
			try {
			c.wait(1);
			}
			catch(InterruptedException E) {	
			}
			System.out.println("Transaction successful");
			System.out.println("Available balance "+(c.bal-bal));
		}
		}
		else
			System.out.println("Transaction successful");
		System.out.println("Available balance "+(c.bal-bal));

	}
}
