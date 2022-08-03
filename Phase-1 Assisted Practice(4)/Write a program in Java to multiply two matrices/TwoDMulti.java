package task;

import java.util.Scanner;

public class TwoDMulti {
	public static void main(String[] args) {
		System.out.println("Matrix Multiplication");
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter number of rows for matrix A ");
		int R1=s.nextInt();	
		System.out.println("Enter number of columns for matrix A ");
		int C1=s.nextInt();	
		System.out.println("Enter number of rows for matrix B ");
		int R2=s.nextInt();	
		System.out.println("Enter number of columns for matrix B ");
		int C2=s.nextInt();
		
		int arrA[][] = new int[R1][C1];
		int arrB[][] = new int[R1][C2];
		int arrC[][] = new int[R1][C2];
		
		
		
			for(int i=0;i<R1;i++)
			{	for(int j=0;j<C1;j++)
				{
					System.out.println("Enter the value of index of array A "+i+" "+j);
					arrA[i][j]=s.nextInt();	
					
				
				}
			}

			for(int i=0;i<R2;i++)
			{	for(int j=0;j<C2;j++)
				{
					System.out.println("Enter the value of index of array B "+i+" "+j);
					arrB[i][j]=s.nextInt();	
					
				
				}
			}
		
			if(R2==C1)
			{
				for(int i=0;i<R1;i++)
				{	for(int j=0;j<C2;j++)
					{
						for(int k=0;k<R2;k++)
						{
							arrC[i][j]=arrC[i][j]+(arrA[i][k]*arrB[k][j]); //Matrix Multiplication
						}
						
					}
				}
			}
			else
			{System.out.println("Enter Correct valid number of rows and column!");}
			
			System.out.println("Matrix multiplication of 2");
			for(int i=0;i<R2;i++)
			{	for(int j=0;j<C2;j++)
				{
					System.out.print(arrC[i][j]+" ");
				}
				System.out.println("\n");
			}
		}
			
		
		
	

}
