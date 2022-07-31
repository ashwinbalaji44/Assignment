package keyword_exception;

import java.util.Scanner;

public class ThrowKey {
	public static void main(String[] args) {
		int a[] = {1,2,3};
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter index of array:");
		int i=sc.nextInt();
		
		try {
			if(i>2)
				throw(new Exception("Array out of bounds"));
			else
			{	for(i=0;i<3;i++)
				{
					System.out.println(a[i]);
				}
			}
		}
		catch(Exception e)
		{
			System.out.println("Error: "+e.getMessage());
		}
		
		System.out.println("End of Program");
	}

}
