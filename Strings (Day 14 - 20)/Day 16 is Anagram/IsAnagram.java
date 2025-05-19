import java.lang.*;
import java.util.*;


public class IsAnagram {

    static boolean isAnagram(String s1 , String s2){

        if(s1.length() != s2.length()){
            return false;
        }
        
        HashMap<Character , Integer> h = new HashMap<>();
        for(int i = 0; i<s1.length(); i++){
            h.put(s1.charAt(i), h.getOrDefault(s1.charAt(i), 0) + 1);
        }

        for(int i = 0; i<s2.length(); i++){
            if(!h.containsKey(s2.charAt(i))){
                return false;
            }
            h.put(s2.charAt(i) , h.getOrDefault(s2.charAt(i), 0) -1);
        }

        

        
        return true;
    }
    
    public static void main(String[] args) {
        String s1 = "geeks";
        String s2 = "eeks";

        System.out.println(isAnagram(s1, s2));

    }
}
