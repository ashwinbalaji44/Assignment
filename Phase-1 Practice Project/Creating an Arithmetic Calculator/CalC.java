package arithmetic_calculator;

import java.util.Scanner;

public class CalC {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number a:");
		int a = scan.nextInt();
		System.out.println("Enter number b:");
		int b = scan.nextInt();
		System.out.println("Select an operation need to be performed (+,-,*,/):");
		char s = scan.next().charAt(0);
		if(s=='+'){
			System.out.println("Sum of a & b: "+(a+b));
		}
		else if(s=='/'){
			if(b==0)
				System.out.println("b cannot be zero");
			else
				System.out.println("Division of a & b:"+(a/b));
		}
		else if(s=='-'){
			System.out.println("Difference of a & b: "+(a-b));
		}
		else
		{
			System.out.println("Product of a & b: "+(a*b));
		}
		
	}	
	
}
