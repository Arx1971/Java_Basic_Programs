package InputStream;

import java.io.FileInputStream;
import java.io.IOException;

public class Main {
	
	public static void main(String args[])throws IOException{
		
		FileInputStream fin = null;
		
		try {
			fin = new FileInputStream("home:\\rahin\\Desktop\\text.txt");
			
			int i=0;
			
			while((i=fin.read())!=-1){
				System.out.print((char)i);
			}
			
		} catch (Exception e) {
			System.out.println("Code Is Not Working:" + e);
		}
		
		fin.close();
	}
	
}
