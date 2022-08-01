package longestincreasesequence;
import java.util.Scanner;

public class LIS {
		static int longsubseq(int arr[], int arr_len){
		      int a[] = new int[arr_len];
		      int i, j, max = 0;
		      // a[] = [1 1 1 1 ...]
		      for (i = 0; i < arr_len; i++){
		         a[i] = 1;
		      }
		      
		      for (i = 1; i < arr_len; i++){
		    	  for (j = 0; j < i; j++){
		    		  	if (arr[i] > arr[j] && a[i] < a[j] + 1)
		    		  		a[i] = a[j] + 1;
		    	  }
		      }
		      
		      for (i = 0; i < arr_len; i++){
		    	  if (max < a[i])
		    		  max = a[i];
		      }
		      return max;
		}
		public static void main(String[] args) {
			Scanner scn = new Scanner(System.in);
			int index;
			System.out.println("Enter the no. of elements to be entered into the array");
			index=scn.nextInt();
			int[] arr = new int[index];
			System.out.println("Enter the elements in the array");
			for(int i=0;i<index;i++){
			arr[i]=scn.nextInt();
			}
			int arrlen=arr.length;
			System.out.println("The length of the longest increasing subsequence is " 
			+  longsubseq(arr,arrlen));

		}
}
