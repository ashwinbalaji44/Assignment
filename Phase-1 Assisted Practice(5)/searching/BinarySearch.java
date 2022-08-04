package searching;

public class BinarySearch {

    public static  void main(String[] args){

        int[] arr = {2,4,5,7,9,10,12,15,18,20};
        int key =10 ;
        int arrlen = (arr.length-1);  
        bsearch(arr,0,key,arrlen);
    }

public static void bsearch(int[] arr, int start, int key, int length){

        int mid = (start+length)/2;       
        while(start<=length){

            if(arr[mid]<key){
                start = mid + 1;
            } else if(arr[mid]==key){
                System.out.println("Element is found at index :"+mid);
                break;
            }else {

                length=mid-1;
            }
            mid = (start+length)/2;
        }
            if(start>length){

                System.out.println("Element is not found");
            }      
    }
}
