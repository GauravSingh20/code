package jsonAndFile;

import java.util.Formatter;

public class CreatingFiles {
	public static void main(String[] args) {
		final Formatter x;
		
		try {
			x= new Formatter("E:\\test\\Hello world.txt");
			System.out.println("You Created a File");
		}
		catch(Exception e) {
			System.out.println("You Got an Error"); 
		}
	}
	

}
