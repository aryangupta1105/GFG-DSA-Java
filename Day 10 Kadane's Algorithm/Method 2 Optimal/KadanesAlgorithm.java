import java.lang.*;

public class KadanesAlgorithm {
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
    public static void main(String[] args) {
        int arr[] = {-2, -4};
        System.out.println(maxSubArray(arr));
    }
}
