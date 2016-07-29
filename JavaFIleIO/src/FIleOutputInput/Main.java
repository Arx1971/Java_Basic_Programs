package FIleOutputInput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	static Scanner input = new Scanner(System.in);
	
	public static void main(String args[]) throws IOException{
		
		FileOutputStream fout = null;
		FileInputStream fin = null;
		
		int test_case;
		
		try{
			
			fout = new FileOutputStream("home:\\rahin\\Desktop\\ouput.txt");
			test_case = input.nextInt();
			
			for(int i=1; i<=test_case; i++){
				for(int j=1; j<=i; j++){
					fout.write("*".getBytes());
				}
				fout.write("\n".getBytes());
			}
			
		}
		catch (Exception e) {
			System.out.println(e);
		}
		fout.close();
		try {
			fin = new FileInputStream("home:\\rahin\\Desktop\\ouput.txt");
			int i=0;
			while((i=fin.read())!=-1){
				
				System.out.print((char)i);
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
		fin.close();
	}
}
