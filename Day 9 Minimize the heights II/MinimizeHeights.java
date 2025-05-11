import java.lang.*;
import java.util.*;

public class MinimizeHeights{

    static int minimumDifference(int arr[] , int k){

        // to minimize the difference between two towers:
        Arrays.sort(arr);

        // finding the original difference between towers:
        int ans = arr[arr.length-1] - arr[0];
        
        // finding the largest element:
        int largest = arr[arr.length-1] - k;
        // finding the smallest element:
        int smallest = arr[0] + k;

        int mi , ma;

        for(int i = 0; i<arr.length-1; i++){
            mi = Math.min(smallest, arr[i+1] - k);
            ma = Math.max(largest, arr[i]+k);

            if(mi >= 0){
                ans = Math.min(ans , ma-mi);
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {3, 9, 12, 16, 20};
        int k = 3;
        System.out.println(minimumDifference(arr, k));
    }
}