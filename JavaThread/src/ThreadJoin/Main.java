package ThreadJoin;

public class Main {

	public static void main(String args[]){
		
		TestJoinMethod t1 = new TestJoinMethod();
		TestJoinMethod t2 = new TestJoinMethod();
		TestJoinMethod t3 = new TestJoinMethod();
		
		t1.start();
		
		try {
			
			t1.join();
			
		} catch (Exception e) {
		// TODO: handle exception
		}
		t2.start();
		t3.start();
		System.out.println("stop");
		//t2.stop();
		
		
	}
	
}
