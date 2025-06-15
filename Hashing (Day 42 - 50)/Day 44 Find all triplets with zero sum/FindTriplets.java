import java.lang.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FindTriplets {
    static  Set<List<Integer>> findTripletsWithZeroSum(int arr[] ){
        Set<List<Integer>> ans = new HashSet<>();
        
        for(int i = 0; i<arr.length; i++){
            int newTarget = 0 - arr[i];
            Map<Integer, ArrayList<Integer>> h = new HashMap<>();
            for(int j = i+1; j<arr.length; j++){
                int num = arr[j];
                int complement = newTarget - arr[j];
                
                if(h.containsKey(complement)){
                    for(int complementIndex: h.get(complement)){
                        if(i< complementIndex && complementIndex < j){
                            ans.add(Arrays.asList(i , complementIndex , j));
                        }
                    }
                }
                
                h.putIfAbsent(num , new ArrayList<>());
                h.get(num).add(j);
            }
        }
        
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {0 ,-1 , 2 , -3 , 1};
        System.out.println(findTripletsWithZeroSum(arr));
    }
}
