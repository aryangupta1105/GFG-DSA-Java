
import java.util.HashMap;


public class Equal0s1sSubArray {
    static int maxLen(int[] arr) {
        // Your code here
        HashMap<Integer , Integer> preSum = new HashMap<>();
        int sum = 0; 
        int n = arr.length-1;
        int ans = 0; 
        for(int i = 0; i<arr.length; i++){
            sum += arr[i] == 1? 1: -1;
            
            if(sum == 0){
                ans = i+1;
            }
            
            if(preSum.containsKey(sum)){
                ans = Math.max(ans , i-preSum.get(sum));
            }
            else{
                preSum.put(sum , i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1 , 0 , 0 , 1, 1, 1, 0};
        System.out.println(maxLen(arr));
    }
}
