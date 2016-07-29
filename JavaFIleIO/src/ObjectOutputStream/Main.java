package ObjectOutputStream;

import java.io.FileOutputStream;

public class Main {

	public static void main(String[] args) {
		
		Student male ;
		
		String name = "Tom and Jerry";
		String id = "Cartoon";
		int age = 20;
		
		male = new Student(name,age);
		male.setId(id);
		FileOutputStream fout = null;
		
		try {
			
			fout = new FileOutputStream("student.txt");
			fout.write(male.getName().getBytes());
			fout.write(male.getAge());
			fout.write(male.getId().getBytes());
			
		} catch (Exception e) {
			System.out.println("There is an Error Found in " + e);
		}
		
	}

}
