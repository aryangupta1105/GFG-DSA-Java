import java.util.ArrayList;
import java.util.Arrays;

public class PermutationsOfString {
    private void backtrack(char[] chars, StringBuilder path , boolean[] used, ArrayList<String> result){
        if(path.length() == chars.length){
            result.add(path.toString());
            return;
        }
        
        for(int i = 0; i<chars.length; i++){
            if(used[i]) continue; 
            
            if(i>0 && chars[i] == chars[i-1] && !used[i-1]) continue;
            
            used[i] = true; 
            path.append(chars[i]);
            backtrack(chars , path, used , result);
            path.deleteCharAt(path.length()-1);
            used[i] = false; 
        }
    }
    
    public ArrayList<String> findPermutations(String s) {
        ArrayList<String> result = new ArrayList<>(); 
        char[] chars = s.toCharArray(); 
        Arrays.sort(chars); 
        boolean[] used = new boolean[chars.length];
        backtrack(chars , new StringBuilder() , used , result);
        return result;
        
    }

      public static void main(String[] args) {
         PermutationsOfString sol= new PermutationsOfString();
        System.out.println(sol.findPermutations("ABC"));
        System.out.println(sol.findPermutations("ABSG"));
        System.out.println(sol.findPermutations("AAA"));
    }
}
