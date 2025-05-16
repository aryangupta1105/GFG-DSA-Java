import java.lang.*;


// Approach: 
/*
 * 1) The answer may be in the middle or in circular side
 * 2) if the maxSum in circular then in middle must be min Sum: 
 *  - Calculate Min sum using kadane's algorithm.
 *  - So find the totalSum and max = totalSum - minSum:
 * 3) if the maxSum is in the middle Return maxSum.
 * 
 * 4) if (maxSum > 0) return Math.max(maxSum , maxSumCircular);
 */

public class MaxSubArrayCircular {

    // finding minimum sub array using Kadane's algorithm: 
    static int minSubArray(int arr[]){
        int minSum = arr[0]; 
        int sum = arr[0];
        for(int i = 0; i<arr.length; i++){
            sum = Math.min(sum + arr[i], arr[i]);

            minSum = Math.min(minSum, sum);
        }

        return minSum;
    }

    static int maxSubArray(int arr[]){
        int maxSum = Integer.MIN_VALUE; 
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum += arr[i];
            if(sum >= maxSum)  maxSum = sum;
            if(sum < 0) sum = 0; //dropping negative elements 
        }

        return maxSum;
    }

    static int maxSubArrayCircular(int arr[]){
        // find total Sum: 
        int totalSum = 0; 
        for(int i = 0; i<arr.length; i++)
        {
            totalSum += arr[i];
        }
        int minSum = minSubArray(arr);

        int maxSumCircular = totalSum - minSum;

        // if the answer is in the middle of array
        int maxSum = maxSubArray(arr);

        if(maxSum > 0) return  Math.max(maxSum, maxSumCircular);

        return maxSum;
    }

    public static void main(String[] args) {
        int arr[] = {-7, 32, -11, 21 ,18, 35 ,-26, -17, 35 ,-12, -38, -33 ,32 ,16 ,44, 11 ,-40 ,-21,27, -35 ,21 -37, -12 ,1};
        System.out.println(maxSubArrayCircular(arr));
    }
}
