package twoeight;

import java.util.Scanner;

public class StackEx {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the size of the stack");
	int size =sc.nextInt();
	int stack[]=new int [size];
	int top=-1;
	System.out.println("Stack operations");
	while(true)
	{
		System.out.println("Enter 1:Push 2:Pop 3:Display 4:Exit");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:if(top==size-1)
				{
					System.out.println("Stack is full no more insertion");
				}
				else
				{
					System.out.println("Enter the element to insert");
					int key = sc.nextInt();
					top++;
					stack[top]=key;
				}
			break;
		case 2:if(top==-1)
				System.out.println("Stack is empty no deletion");
				else
				 top=top-1;
				break;
		case 3: if(top==-1)
					System.out.println("Stack is empty no display of elements");
				else
				{
					for(int i=top;i>=0;i--)
					{
						System.out.println(stack[i]);
					}
				}
				break;
		case 4:System.exit(0);
				break;
		default: System.out.println("Check your choice");
		break;
		}
	}
	
}
}
