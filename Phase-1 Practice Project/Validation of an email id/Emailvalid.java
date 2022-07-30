package validation_email;

import java.util.ArrayList;
import java.util.Scanner;

public class Emailvalid {
	  public static void main(String[] args) {
		ArrayList<String> emails = new ArrayList<String>();  
		emails.add("ram47@yahoo.co.in");  
		emails.add("bheem75@gmail.com");  
		emails.add("ashwinb7@gmail.com");  
		emails.add("aasiq@yahoo.co.in");  
		emails.add("jash2184@gmail.com");  
		emails.add("surya44@gmail.com");  
		System.out.println("Enter email ID: ");
		Scanner sc =new Scanner(System.in);
		String e = sc.next();
		for(int i=0; i<emails.size();i++)
		{
			if(e.equals(emails.get(i)))
			{
				System.out.println("Valid email ID");
				break;
			}
			if(i==(emails.size()-1))
				System.out.println("Invalid email ID ");
		}
		

}
}
