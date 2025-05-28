import java.lang.*;
import java.util.*;


public class NonOverlappingInterval {

    static int countNonOverlappingIntervals(int arr[][]){
        Arrays.sort(arr , (a,b)->Integer.compare(a[1], b[1]));
        int count = 0;

        int lastEndTime = arr[0][1];

        for(int i = 0; i<arr.length; i++){
            if(arr[i][0] >= lastEndTime){
                count++;
                lastEndTime = arr[i][1];
            }
        }

        return arr.length - count -1;
    }

    public static void main(String[] args) {
        int arr[][] = { {1, 3},{1, 3},{1, 3}};

        System.out.println(countNonOverlappingIntervals(arr));

    }
}
