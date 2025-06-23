import java.lang.*;
import java.util.*;

public class CountPairs {

    static int countPairs(int arr[], int target) {
        Arrays.sort(arr); 
        int s = 0; 
        int e = arr.length-1;
        int count = 0; 
        while(s<e){
            if(arr[s] + arr[e] < target){
                count += e-s;
                s++;
            }
            else{
                e--;
            }
        }
        
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {7, 2, 5, 3};
        System.out.println(countPairs(arr, 8));
    }
}
