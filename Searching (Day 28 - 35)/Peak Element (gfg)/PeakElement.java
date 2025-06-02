import java.lang.*;


public class PeakElement {
    static  int bs(int arr[] , int s , int e){
        while(s<=e){
            int mid = s + (e-s)/2;
            if( arr[mid]> arr[mid+1] && arr[mid] > arr[mid-1])
                return mid;
            else if (arr[mid]< arr[mid+1]){
                s = mid+1;
            }
            else{
                e = mid-1;
            }
        }
        
        return -1;
    }
    
    static int peakElement(int[] arr) {
        if(arr.length ==1) return 0;
        if(arr[0] > arr[1])
            return 0;
        
        if(arr[arr.length-1] > arr[arr.length-2]) return arr.length-1;
        
        return bs(arr , 1 , arr.length-2);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 5, 7, 8, 3};

        if(peakElement(arr) != -1){
            System.out.println(true);
        }
        else System.out.println(false);
    }
}
