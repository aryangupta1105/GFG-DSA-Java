import java.lang.*;

public class MaxProdSubArray {
    static int findMaxSubArray(int arr[]){
        int maxProd = Integer.MIN_VALUE; 
        int pre = 1; 
        int suff = 1; 
        for(int i = 0; i<arr.length; i++){
            if(pre == 0) pre = 1; 
            if(suff == 0) suff = 1; 
            pre = pre * arr[i];
            suff = suff * arr[arr.length-i-1];
            
            maxProd = Math.max(maxProd, Math.max(pre, suff));

        }
        return  maxProd;
    }
    public static void main(String[] args) {
        int arr[] = {-2, 6, -3, -10, 0, 2};
        System.out.println(findMaxSubArray(arr));
    }
}
