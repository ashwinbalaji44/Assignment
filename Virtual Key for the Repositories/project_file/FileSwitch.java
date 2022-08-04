package project_file;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileSwitch {
public static void main(String[] args) throws IOException {
	
BusinessLevelOperation bls = new BusinessLevelOperation();
Scanner sc = new Scanner(System.in);

outerloop:
	while(true)
	{
		System.out.println("Enter (1): To retrive files in ascending order\nEnter (2): Business level Operation\nEnter (3):Close the application");
		int a=sc.nextInt();
		switch(a)
		{
		case 1:	sortfn();
				System.out.println("Above Files are sorted in ascending order");
				break;
		case 2:	bls.operation();
				System.out.println("Returned to Main Menu");
				break;
		case 3: break outerloop;
		}
	}
System.out.println("End of Page");
	}

	private static void sortfn() {
		String path="E:\\java programming\\";

		File f=new File(path);
		//display operation
		File filenames[]=f.listFiles();
		for(File ff:filenames) {
			System.out.println(ff.getName());
		}

	}
	
}
