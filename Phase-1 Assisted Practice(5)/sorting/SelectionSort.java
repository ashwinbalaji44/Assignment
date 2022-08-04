package sorting;

public class SelectionSort {
	 public static void main(String[] args) {

		    int[] arr = {90,54,74,21,85};
		    selectionSort(arr);
		    System.out.println("Sorted elements:");
		    for(int i:arr){
		        System.out.print(i+" ");
		         }
		     }

		    public static void selectionSort(int[] arr){

		        for(int i=0;i<arr.length;i++){

		            int index =i;
		            for(int j=i+1;j<arr.length;j++){
		                if(arr[j]<arr[index]){

		                    index =j;
		                }
		            }
		            int smallNumber = arr[index]; 
		            arr[index]= arr[i];
		            arr[i]= smallNumber;
		        }
		    }
}
