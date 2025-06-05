import java.lang.*;


public class AllocateMinimumPages {
    static  boolean isPossible(int arr[] , int minimumPages , int k)
    {
        int currPages = arr[0];
        int count = 1; 
        for(int i = 1; i<arr.length; i++){
            if(arr[i] + currPages <= minimumPages){
                currPages += arr[i];
            }
            else{
                currPages = arr[i];
                count++;
            }

        }
        if(count > k){
            return false;
        }
        return true;
    }


    static int binarySearch(int arr[] , int s , int e , int k){
        int ans = -1;
        while(s<=e){
            int mid = s + (e-s)/2;
            if(isPossible(arr, mid, k)){
                ans = mid; 
                e = mid -1;
            }
            else{
                s = mid + 1;
            }
        }
        return ans;
    }

    static int allocateMinimumPages(int arr[] , int k){
        int totalPages = 0; 
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > max) max = arr[i];
            totalPages += arr[i];
        }

        return binarySearch(arr, max , totalPages, k);
    }
    public static void main(String[] args) {
        int arr[] = {12, 34, 67, 90};
        int k = 2; 
        System.out.println(allocateMinimumPages(arr, k));
    }
}
