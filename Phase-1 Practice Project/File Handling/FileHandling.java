package file_handling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandling {
	public static void main(String[] args) throws IOException {
		FileInputStream fi = new FileInputStream("in");      //Reading input from the existing file name: in
		FileOutputStream fo = new FileOutputStream("out",true); //Given true to append to the existing file
		if(fi!=null)
			System.out.println("File exist");
		int i=0;
		while((i=fi.read())!=-1)
		{
			fo.write(i);  //Writing output into the file name: out
		}
		fo.close();
		fi.close();

	}
}
