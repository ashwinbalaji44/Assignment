package arrayrot;

import java.util.Scanner;

public class ArrRotation {
public static void main(String[] args) {
	int arr[] = {1,2,3,4,5};
	System.out.println("Enter the number of rotations: ");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	
	System.out.println("Array before rotation");
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+" ");
	}
	
	for(int i=0;i<n;i++)
	{
		int j,last;
		last=arr[arr.length-1];
		for(j=arr.length-1;j>0;j--)
		{
			arr[j]=arr[j-1];
		}
		arr[0]=last;
	}
	
	System.out.println("\nAfter rotation for "+n+" times:");
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+" ");
	}
	
}
}
