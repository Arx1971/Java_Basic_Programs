package javaDaimoneThread;

public class Main {
	
	public static void main(String args[]){
		
		
		/// The caste System
		
		/**User Thread - A user Thread Perform important work's for the program 
		  user, Work that must be done before the program terminate.
		  
		  Daemon Thread - Daemon Thread perform some kinds housekeeping work like 
		  garbage collection and other background work, those are not related with 
		  main application but needed to be done to continue the application.
		  Unlike user threads, daemon threads do not need to finish 
		  before the application terminates.
		 */
		
		TestDaemonThread t1 = new TestDaemonThread();
		TestDaemonThread t2 = new TestDaemonThread();
		TestDaemonThread t3 = new TestDaemonThread();
		
		
		t1.setDaemon(true);
		t2.setDaemon(true);
		
		t1.start();
		t2.start();
		t3.start();
		
		
		System.out.println(t1);
		System.out.println(t3.getName()+" is alive "+t3.isAlive());
		t3.stop();
	}
	
}
