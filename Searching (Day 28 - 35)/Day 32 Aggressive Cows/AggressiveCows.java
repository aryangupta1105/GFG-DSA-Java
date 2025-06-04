import  java.lang.*;
import java.util.Arrays;

public class AggressiveCows {

    static boolean isPossible(int stalls[] , int distance , int  k )
    {
        int lastPosition = stalls[0];
        int count = 1; 

        for(int i = 0; i<stalls.length; i++){
            if(stalls[i] - lastPosition >= distance )
            {
                count++;
                lastPosition = stalls[i];
            }

            if(count >= k){
                return true;
            }
        }
        return false;
    }


    static int binarySearchPossible(int stalls[] ,int s , int e , int k )
    {
        int ans = -1;
        while(s<=e){
            int mid = s + (e-s)/2;

            if(isPossible(stalls , mid , k)){ 
                 ans = mid;
                 s = mid+1;
            }
            else{
                e = mid -1;
            }
        }
        return ans;
    }


    static int aggressiveCowsMaxDistance(int arr[] , int k){
        // int max = Integer.MIN_VALUE; 
        // int min = Integer.MAX_VALUE;

        // for(int i = 0; i<arr.length ; i++){
        //     if(arr[i] > max) max = arr[i];
        //     if(arr[i] < min) min = arr[i];
        // }

        
        Arrays.sort(arr);

        int possibleDistances = arr[arr.length-1] - arr[0];

        return binarySearchPossible(arr, 0, possibleDistances, k);
    }
    public static void main(String[] args) {
        int stalls[] = {2, 12, 11, 3, 26, 7};

        System.out.println(aggressiveCowsMaxDistance(stalls, 5));
    }
}
