package setThreadName;

public class Main {

	public static void main(String[] args) {
		
		
		ourThread ourt1 = new ourThread();
		ourThread ourt2 = new ourThread();
		
		System.out.println(ourt1.getName());
		System.out.println(ourt2.getName());
		
		
		ourt1.setName("T1");
		ourt2.setName("T2");
		
		System.out.println(ourt1.getName());
		System.out.println(ourt2.getName());
	}

}
