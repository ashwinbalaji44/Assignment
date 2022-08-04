package sorting;

public class BubbleSort {
	public static void main(String[] args){

	     int[] a= {90,54,74,21,85};
	     bubbleSort(a);
	     System.out.println("Sorted Elements:");
	     for(int i=0;i<a.length;i++){

	        System.out.print(a[i]+" ");
	        }
	    }

	    public static void bubbleSort(int[] arr){
	        int len = arr.length;
	        int temp = 0;
	        for(int i=0;i<len;i++){
	            for (int j=1;j<(len);j++){
	                if(arr[j-1]>arr[j]){
	                temp = arr[j-1];
	                arr[j-1]= arr[j];
	                arr[j]= temp;
	                }
	             }
	        }
	    }
}
