
import java.util.HashMap;


public class Optimal {
     static int countMaxSubArraysOptimal(int arr[] , int target){
        HashMap<Integer , Integer> h = new HashMap<>();
        int preCount = 0;   
        int preSum = 0; 
        h.put(0 , 1);
        for(int i = 0; i<arr.length;i++){
            preSum += arr[i];
            int remove = preSum - target;
            if(h.containsKey(remove)){
                preCount += h.get(remove);
            }
            h.put(preSum, h.getOrDefault(preSum, 0)+1);
        }
        
        return preCount;
    }
    public static void main(String[] args) {
        int arr[] = {10 , 2 , -2 , -20 , 10} ; 
        System.out.println(countMaxSubArraysOptimal(arr, -10));

    }
}
