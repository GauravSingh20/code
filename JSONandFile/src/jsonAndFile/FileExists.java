package jsonAndFile;

import java.io.File;

public class FileExists {

	public static void main(String[] args) {
		File x = new File   ("E:\\test\\tcs.txt");
		
		if(x.exists())
			System.out.println(x.getName() + " exists");
		else
			System.out.println("Doesn't Exists");

	}

}
