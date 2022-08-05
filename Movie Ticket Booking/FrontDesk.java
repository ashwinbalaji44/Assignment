package mtb;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class FrontDesk {
	public static void main(String[] args) {
		//user name -password
		String userpass[] = new String[]{"Virat","virAt@123","Dhoni","Dhoni123/","Rohit","rohit#13","Ricky","ricky789","Rhodes","rhodes456"};
		
		System.out.println("-------TicketExpress-------");
		Scanner sc =new Scanner(System.in);
		System.out.println(" Welcome, Enter Username:");
		String user= sc.next();
		System.out.println("Enter Password:");
		String pass= sc.next();
		login(userpass,user,pass);
		
	}
	
	public static void login(String userpass[],String user, String pass)
	{
		int i=0;
		while(i<10)
		{
			if(userpass[i].equals(user) && userpass[i+1].equals(pass))
			{
				Scanner sc =new Scanner(System.in);
				System.out.println("Login successful");
				System.out.println("Do you need change your password?(y/n)");
				String yn= sc.next();
			
				if(yn.equals("y")){	
					System.out.println("Enter old password:");
					String old =sc.next();
					if(old.equals(userpass[i+1])){
						System.out.println("Enter new password:");
						userpass[i+1]=sc.next();
						System.out.println("Password saved");
						WebLogin();
					}
					else
						System.out.println("Invalid old password");break;
				}		
				WebLogin(); //Logging Into the Website if Username and Password are correct
				break;
			}
			else if(userpass[i].equals(user)){	
				System.out.println("Invalid Password\n");
				break;
			}
			else{	
				if(i==userpass.length-2){
					System.out.println("User not logged in. Create a account");
					break;
				}	
			}
			i=i+2;	
		}
	
		
	}
	
	static void WebLogin()
	{	
		System.out.println("Enter the timing for the movie(1/2/3): \n1. 11:00AM\n2. 2:00PM\n3. 6:00PM");
		Scanner sc =new Scanner(System.in);
		int time = sc.nextInt();
		switch(time){
			case 1:	bookticket(time); break;
			case 2:	bookticket(time); break;
			case 3:	bookticket(time); break;		
			default:System.out.println("Enter Valid show number:");
		}
	}
	
	static void bookticket(int time){
		System.out.println("Enter the number of seats: ");
		Scanner sc =new Scanner(System.in);
		int size = sc.nextInt();
		int seats[] =new int[size];
		int B[] =new int[150];
		Arrays.fill(B, 0);
		
		//Displaying the seats available
		System.out.println("Seats Available:");
		for(int j=0;j<150;j++){
			if(j%10==0 && j!=0)
				System.out.print("\n");
			System.out.print(B[j]+" ");	
		}
		System.out.println("\n-------------------\n  Screen This Way");
		
		//Entering Seat number
		for(int k=0;k<size;k++){
			System.out.print("\nEnter Seat no(1-150):");
			seats[k]=sc.nextInt()-1;
			if(B[seats[k]]!=1)
				B[seats[k]]=1;
			else{
				System.out.println("Select empty seat");
				k--;
			}
		}

		System.out.println("\nSeats selected:\n");
		for(int j=0;j<150;j++) {
			if(j%10==0 && j!=0)
				System.out.print("\n");
			System.out.print(B[j]+" ");	
		}	
		System.out.println("\n===================\n  Screen This Way\n");
		
		int ticket = 150*size;
		System.out.println("Ticket for "+size+" members are: Rs."+ticket+"/-\nEnter ticket amount displayed for payment:");
		
		while(true){
			int returnticket =sc.nextInt();
			if(ticket==returnticket){
				System.out.println("Payment Received");
				break;
			}
			else
			System.out.println("Payment not valid, Please Pay again");
		}
		
		System.out.println("Displaying Ticket\n");
		bill(size,ticket,seats,time);
	}

	 static void bill(int size, int ticket, int[] seats,int time) {
		 System.out.println(" TicketExpress"
		 		+ "\n    Bill"
		 		+ "\n===================\n=================== "
		 		+"\n No. of seats: "+size+"\n Ticket Amount= "+size+"*150 = "+ticket );
		 for(int i=0;i<size;i++)
		 {System.out.println(" Seat Number: "+(seats[i]+1));}
		 if(time==1)
			 System.out.println(" Show timing: 11:00 AM");
		 else if(time==2)
			 System.out.println(" Show timing: 2:00 PM");
		 else
			 System.out.println(" Show timing: 6:00 PM");
		 String txnid=getRandomNumberString();
		 System.out.println(" Transaction ID: "+txnid);    
		 SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
		 Date date = new Date();  
		 System.out.println(" Generated at: "+formatter.format(date));  
	 }
	 
	 static String getRandomNumberString() {
		    Random rnd = new Random();
		    long number = rnd.nextInt(999999999);
		    return String.format("%09d", number);
		}	
}