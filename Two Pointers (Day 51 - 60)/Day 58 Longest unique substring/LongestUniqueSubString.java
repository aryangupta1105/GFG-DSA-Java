import java.lang.*;
import java.util.*;

public class LongestUniqueSubString {

    static int longestUniqueSubstr(String s) {
        
        HashMap<Character , Integer> map = new HashMap<>();
        int l = 0; 
        int r = 0; 
        int length = 0;
        while(r < s.length()){
            
            char outEle = s.charAt(r);
            
            if(map.containsKey(outEle) && map.get(outEle) >= l){
                l  = map.get(outEle) + 1;
            }
            
            map.put(s.charAt(r) , r);
            if(r-l+1 > length) length = r-l+1;
            r++;
            
        }
        return length;
    }
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        System.out.println(longestUniqueSubstr(s));

    }
}
