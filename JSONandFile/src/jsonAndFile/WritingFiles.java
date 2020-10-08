package jsonAndFile;

public class WritingFiles {

	public static void main(String[] args) {
		CFileForWriting g=new CFileForWriting();
		g.openFile();
		g.addRecords();
		g.CloseFile();

	}

}
