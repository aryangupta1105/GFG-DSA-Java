import java.lang.*;

public class MaximumSubarray {

    static int  maxSubArray(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            int newSum = 0;
            for(int j = i; j<arr.length; j++){
                newSum += arr[j];
                if(newSum >= maxSum)
                {
                    maxSum = newSum;
                }
            }
        }
        System.out.println(maxSum);
        return  maxSum;
    }
    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 7, 8};
        
        maxSubArray(arr);
    }
}
