package practice_1;

public class CaclPi {
	
	public static void main(String args[]) throws InterruptedException{
		
		Mythread mt = new Mythread();
		
		mt.start();
		
		try {
			
			Thread.sleep(10000);
			
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		System.out.println("pi = " + mt.pi);
	}
	
}
class Mythread extends Thread{
	
	boolean negetive = true;
	
	double pi;
	
	public void run(){
		
		for(int i=3; i<10000; i+=2){
			
			if(negetive)
				pi -=(1.0/i);
			else 
				pi +=(1.0/i);
				
			negetive = !negetive;
				
		}
		
		pi += 1.0;
		pi *= 4.0;
		
		System.out.println("Finished Calculating PI: ");
	}
}