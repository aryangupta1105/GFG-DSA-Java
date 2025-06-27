import java.lang.*;
import java.util.ArrayList;

public class SubArraySum {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        int i = 0; 
        int j = 0;
        int sum =0; 
        ArrayList<Integer> ans = new ArrayList<>();
        while( j < arr.length && i < arr.length){
            sum +=  arr[j];
           
            while(sum>target && i<=j)  {
                sum -= arr[i]; 
                i++;
            }
            if(sum == target){
                ans.add(i+1);
                ans.add(j+1);
                return ans;
            }
            j++;
        }
        
        ans.add(-1);
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 7, 5};
        System.out.println(subarraySum(arr, 12));
    }
}
