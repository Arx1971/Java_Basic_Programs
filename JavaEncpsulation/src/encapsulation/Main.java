package encapsulation;

public class Main {
		
	public static void main(String args[]){
	
		
		StudentClass male = new StudentClass();
		
		String std_name = "MICHALE JORDAN";
		String std_address = "UNITED STATE";
		String std_id = "12345";
		int std_age = 33;
		
		double q = 89.5;
		double mid = 91.54;
		double fin = 96.4;
		double pro = 99.99;
		String courseno = "JAVA - 190";
		
		male = new StudentClass(std_name,std_address,std_age);
		
		male.setId(std_id);
		
		StudentGrade malegrade = new StudentGrade(q, mid, pro, fin);
		
		malegrade.setCoursenumber(courseno);
		
		if(male.getId()==true){
	
			System.out.println("Name: " + male.name);
			System.out.println("Address: " + male.address);
			System.out.println("AGE: " + male.age);
			
			System.out.println("CourseNumber: " + malegrade.getCoursenumber());
			System.out.println("Grade: " + malegrade.getGrade());
		}
		
	}
	
}
