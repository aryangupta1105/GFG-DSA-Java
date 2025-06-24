import java.lang.*;
import java.util.*;

public class SumPairClosest {
    static List<Integer> sumClosest(int[] arr, int target) {
        Arrays.sort(arr);
        List<Integer> ans = new ArrayList<>();
        if(arr.length <=1) return ans;
        int s= 0; int e = arr.length-1;
        int minDiff = Integer.MAX_VALUE; 
        int maxInnerDiff = Integer.MIN_VALUE;
        int a = -1; int b = -1;
        while(s<e){
            int innerDiff = Math.abs(arr[e] - arr[s]);
            int sum = arr[s] + arr[e];
            int diff = Math.abs(target - sum);
                
            if( diff < minDiff || ((diff == minDiff) && innerDiff > maxInnerDiff )){
                minDiff = diff; 
                maxInnerDiff = innerDiff; 
                a = arr[s];
                b =arr[e];
            }
            
            if(sum < target)
            {  
                s++;
            }
            else{
                e--;
            }
        }
        if(a != -1 && b != -1)
        {
            ans.add(a);
            ans.add(b);
        }
        return ans;
    }
    public static void main(String args[]){
        int arr[] = {3, 0 , 17}; 
        int target = 10;

        System.out.println(sumClosest(arr ,target));
    }
}
