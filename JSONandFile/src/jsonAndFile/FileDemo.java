package jsonAndFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException{
		FileInputStream in = null;
		FileOutputStream out = null;
		try {
			
			in = new FileInputStream("E:\\test\\input.txt");
			out = new FileOutputStream("E:\\test\\output.txt");
			
			int c;
			while ((c = in.read()) != -1){
				out.write(c);
				}
			
		}finally {
			if (in !=null) {
				in.close();
			}
		}

	}

}
