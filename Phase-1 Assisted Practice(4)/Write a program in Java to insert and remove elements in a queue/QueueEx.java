package twoeight;

import java.util.Scanner;

public class QueueEx {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the size of the queue");
	int size =sc.nextInt();
	int Queue[]=new int [size];
	int front=-1;
	int rear=-1;
	System.out.println("Queue operations");
	while(true) {
		System.out.println("Enter 1.Enqueue 2.Dequeue 3.Display 4.Exit");
		int ch =sc.nextInt();
		switch(ch) {
		case 1: if(rear==size-1) {System.out.println("Q is full no more insertion");}
				else {System.out.println("Enter the element to insert");
				int key =sc.nextInt();
				rear++;
				Queue[rear]=key;
				front=0;}
				break;
		case 2: if((front==-1&&rear==-1)||(front>rear)) {System.out.println("Q is empty no del operation");}
			  	else {front=front+1;}
				break;
		case 3: if((front==-1&&rear==-1)||(front>rear)) {System.out.println("Q is empty");}
				else {for(int i=front;i<=rear;i++) {System.out.println(Queue[i]);}}
				break;
		case 4: System.exit(0);
				break;
		default:System.out.println("Check ur choice");break;
		}
	}
}
}