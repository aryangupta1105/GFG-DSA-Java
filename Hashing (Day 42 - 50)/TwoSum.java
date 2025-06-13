import java.lang.*;
import java.util.*;

public class TwoSum {

    static boolean twoSum(int arr[] , int target){
        HashMap<Integer , Integer> h = new HashMap<>();

        for(int i = 0; i<arr.length; i++){
            h.put(arr[i], target-arr[i]);
        }

        for(int i = 0; i<arr.length; i++){
            if(target-arr[i] != arr[i] && h.containsKey(target- arr[i]))
                return true;
        }

        return false;

    }
    public static void main(String[] args) {
        int arr[] = {1 , 4, 45, 6, 10 , 8};
        System.out.println(twoSum(arr, 54));

    }
}
