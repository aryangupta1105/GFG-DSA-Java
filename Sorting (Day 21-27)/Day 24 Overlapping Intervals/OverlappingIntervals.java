import java.lang.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OverlappingIntervals {

    static List<int[]> OverlappingIntervals(int arr[][]){
        Arrays.sort(arr , (a,b)-> Integer.compare(a[0] , b[0]));
        
        List<int[]> result = new ArrayList<>();
        
        int[] current = arr[0];
        
        for(int i = 1; i<arr.length; i++){
            if(current[1] >= arr[i][0]){
                current[1] = Math.max(current[1], arr[i][1]);
            }
            else{
                result.add(current);
                current = arr[i];
            }
        }
        result.add(current);
        
        return result;
    
    }

    static List<int[]> insertInterval(int[][] arr , int newArr[]){

        List<int[]> r = OverlappingIntervals(arr);
        


        int current = 


        return r;
    }

    public static void main(String args[]){
        int arr[][] = {{1,3},{2,4},{6,8}, {9,10}};

        OverlappingIntervals(arr);
    }
}
