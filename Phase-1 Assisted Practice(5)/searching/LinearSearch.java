package searching;

import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args){

        int[] a = {8,6,3,10,2};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to be searched");
        int ele = sc.nextInt();
        
        int result = linearing(a,ele);
        if(result==-1){

                System.out.println("Element not in the array");
            } else {

                System.out.println("Element found at position "+result);
            }
        }

public static int linearing(int arr[], int x) {

    int arrlen = arr.length;
    for (int i = 0; i < arrlen - 1; i++) {
        if (arr[i] == x) 
            return i;
     }
            return -1;
   }
}

