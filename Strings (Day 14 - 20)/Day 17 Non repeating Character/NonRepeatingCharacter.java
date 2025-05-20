import java.lang.*;
import java.util.LinkedHashMap;


public class NonRepeatingCharacter {

    static char findNonRepeatingCharacter(String s){
        LinkedHashMap<Character, Integer> h = new LinkedHashMap<>();

        for(int i = 0; i<s.length(); i++){
            h.put(s.charAt(i), h.getOrDefault(s.charAt(i) , 0 )+1);
        }
        System.out.println(h);

        for (Character key : h.keySet()) {
            if(h.get(key) == 1){    
                return key;
            }
        }
        
        
        return '$';
    }

    public static void main(String[] args) {
        String s = "";
        System.out.println(findNonRepeatingCharacter(s));
    }
}
