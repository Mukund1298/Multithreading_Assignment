package accolite;

public class credit extends Thread{
	static  int bal=1000,b=0;
		credit(int b){
			this.b=b;
		}
		credit(){
			
		}
		public void run() {
			synchronized(this) {
				bal+=b;
				notify();
			}
		}
	
}
