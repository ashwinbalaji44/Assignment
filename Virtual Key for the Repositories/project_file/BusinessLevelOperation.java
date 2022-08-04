package project_file;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class BusinessLevelOperation {

	public void operation() throws IOException
	{
		Scanner s = new Scanner(System.in);
		outerloop:
		while(true)
		{	
			System.out.println("Enter 1: Add file\nEnter 2: Delete File\nEnter 3: Search a file\nEnter 4: Return to  Main Menu");
			int b=s.nextInt();
			switch(b)
			{
				case 1:	addfile(); 
						break;
				case 2:	deletefile();
						break;
				case 3:	searchfile();
						break;
				case 4:	break outerloop;
			}
		
		}
		
	}

	private void searchfile() {
		String path="E:\\java programming\\";
		Scanner s=new Scanner(System.in);
		System.out.println("enter the filename to search");
		String filename=s.next();
		File f=new File(path);
		//display operation
		int flag=0;
		File filenames[]=f.listFiles();
		for(File ff:filenames) {
			if(ff.getName().equals(filename)) {
				flag=1;
				break;
			}
			else 
				flag=0;
		}
		
		if(flag==1) 
			System.out.println("file is found");
		
		else 
			System.out.println("file is not found");	
	}

	private void deletefile() {
		String path="E:\\java programming\\";
		Scanner s=new Scanner(System.in);
		System.out.println("enter the filename");
		String filename=s.next();
		String finalpath=path+filename;
		File f=new File(finalpath);
		//delete operation
		f.delete();
		System.out.println("file gets deleted");
	}

	private void addfile() throws IOException {
		String path="E:\\java programming\\";
		Scanner s=new Scanner(System.in);
		System.out.println("enter the filename");
		String filename=s.next();
		String finalpath=path+filename;
		File f=new File(finalpath);
		//create a new file
		boolean b=f.createNewFile();
		if(b!=true) {
			System.out.println("file not created");
		}
		else {
			System.out.println("file created");
		}

	}
}

