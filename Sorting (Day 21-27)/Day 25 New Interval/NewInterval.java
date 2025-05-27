import java.lang.*;
import java.util.ArrayList;
import java.util.List;

public class NewInterval {

    static List<int[]> insertInterval(int arr[][] , int newInterval[]){
        
        ArrayList<int[]> result = new ArrayList<>();
        
        int i = 0; 
        
        while(i<arr.length && arr[i][1] < newInterval[0]){
            result.add(arr[i]);
            i++;
        }
        
        while(i<arr.length && arr[i][0] <= newInterval[1]){
            newInterval[0] = Math.min(arr[i][0] , newInterval[0]);
            newInterval[1] = Math.max(arr[i][1] , newInterval[1]);
            i++;
        }
        result.add(newInterval);
        
        while(i < arr.length){
            result.add(arr[i]);
            i++;
        }
        
        return result;
    }

    // static List<int[]> insertInterval(int[][] arr , int newArr[]){

    //     List<int[]> r = OverlappingIntervals(arr , newArr);

    //     int[] curr = newArr;

        

    //     for(int i = 0; i<r.size()-1; i++){
    //         if(curr[1] >= r.get(i)[0])
    //         {
    //                 r.get(i)[0] = Math.min(curr[0] , r.get(i)[0]);
                    
    //                 r.get(i)[1] = Math.min(curr[1] , r.get(i)[1]);

    //                 curr = r.get(i+1);
    //                 i--;
    //         }
            
    //     }


    //     return r;
    // }

    public static void main(String args[]){
        int arr[][] = {{1,3},{2,4},{6,8}, {9,10}};
        int newInterval[] = {4, 5};
        insertInterval(arr, newInterval);
    }
}
