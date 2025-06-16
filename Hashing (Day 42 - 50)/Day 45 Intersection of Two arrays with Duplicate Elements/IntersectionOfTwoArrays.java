import java.lang.*;
import java.util.*;

public class IntersectionOfTwoArrays {

    static  ArrayList<Integer> intersectionOfTwoArray(int arr[] , int b[]){
        
        HashMap<Integer , Integer> h = new HashMap<>();

        ArrayList<Integer> ans = new ArrayList<>();

        
        for(int i = 0; i<arr.length; i++){
            h.put(arr[i] , 1);
        }
        for(int i = 0; i<b.length; i++){
            if(h.containsKey(b[i]))
            {
                h.put(b[i], h.get(b[i]) + 1);
            }
            
        }

        for(Integer k : h.keySet()){
            if(h.get(k) >1){
                ans.add(k);
            }
        }
            

        return ans;
    }
    public static void main(String[] args) {
        int a [] = {1 , 2, 1, 3, 1};
        int b[] = {3, 1, 3, 4, 1};

        System.out.println(intersectionOfTwoArray(a, b));
    }
}
