package jsonAndFile;

import java.util.Formatter;

public class CFileForWriting{
	private Formatter x;
	 public void openFile() {
		 try {
				x= new Formatter("E:\\test\\India.txt");
				System.out.println("You Created a File");
			}
			catch(Exception e) {
				System.out.println("You Got an Error"); 
			}
	 }
	 public void addRecords() {
		 x.format("%s %s ", "Gaurav", "Singh");
	 }
	 public void CloseFile(){
		 x.close();
	 }
}