import java.lang.*;
import java.util.*;


public class CountPairs {

    static int twoSum(int arr[] , int target){
        HashMap<Integer , Integer> freq= new HashMap<>();
        int count = 0;
        // for(int i = 0; i<arr.length; i++){
        //     h.put(arr[i], h.getOrDefault(arr[i], 0) + 1);
        // }
        // System.out.println(h);

        for(int i = 0; i<arr.length; i++){
            int num = arr[i];
             int complement = target - num;
            // If complement exists in map, add its frequency to count
            if (freq.containsKey(complement)) {
                count += freq.get(complement);
            }
            // Add current number to map
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        System.out.println(freq);
        return count;

    }
    public static void main(String[] args) {
        int arr[] = {1, 5, 7, -1 , 5}; //1, 5, 7, -1 , 5
        System.out.println(twoSum(arr, 6));

    }
}
