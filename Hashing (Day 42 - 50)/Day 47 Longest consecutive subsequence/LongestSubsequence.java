
import java.util.HashMap;


public class LongestSubsequence {
    static int longestConsecutive(int[] arr) {
        HashMap<Integer, Integer> h = new HashMap<>();
        for(int i = 0; i<arr.length; i++){
            h.put(arr[i] , 1);
        }
        int maxCount = 0; 
        
        for(int i = 0; i<arr.length; i++){
            if(!h.containsKey(arr[i]-1))
            {   
                int currKey = arr[i];
                int count = 1; 
                while(h.containsKey(currKey+1)){
                    currKey++;
                    count++;
                }
                
                maxCount = Math.max(maxCount , count);
                
            }
        }
        
        return maxCount;
        
    }

    public static void main(String[] args) {
        int arr[] = {2, 1, 6, 9 , 3, 5, 4};
        System.out.println(longestConsecutive(arr));
    }
}
