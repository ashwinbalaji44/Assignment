package oops;

 
	abstract class Bank{    
		abstract int getRateOfInterest();    
		}    
		class SBI extends Bank{    
		int getRateOfInterest(){return 7;}    
		}    
		class HDFC extends Bank{    
		int getRateOfInterest(){return 8;}    
		}    
		    
		class AbstractionEx{    
		public static void main(String args[]){    
		Bank b;  
		b=new SBI();  
		System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");    
		b=new HDFC();  
		System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");    
		}}    


