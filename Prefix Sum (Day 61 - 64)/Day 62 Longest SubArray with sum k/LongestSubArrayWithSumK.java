import java.lang.*;
import  java.util.*;

public class LongestSubArrayWithSumK {
    static int longestSubarray(int[] arr, int k) {
        // code here
        HashMap<Integer , Integer> h = new HashMap<>();
        int sum = 0; 
        int length = 0; 
        for(int i = 0; i<arr.length; i++){
            sum += arr[i];
            
            if(sum == k){
                length = i+1;
            }
            
            if(h.containsKey(sum-k)){
                length = Math.max(length , i - h.get(sum-k));
            }
            
            if(!h.containsKey(sum)){
                h.put(sum , i);
            }
        }
        return length;
    }

    public static void main(String[] args) {
        int arr[] = {10 , 5, 2 , 7 , 1, -10};
        System.out.println(longestSubarray(arr, 15));

    }
}
