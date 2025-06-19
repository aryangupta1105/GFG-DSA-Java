import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class GroupingAnagrams {
     static ArrayList<ArrayList<String>> anagrams(String[] arr) {
        // code here
        
        HashMap<String , ArrayList<String>> h = new HashMap<>();
        
        for(int i = 0; i<arr.length; i++){
            char[] charArr = arr[i].toCharArray();
            Arrays.sort(charArr);
            String key = new String(charArr);
            
            ArrayList<String> list = h.getOrDefault(key , new ArrayList<>());
            
            list.add(arr[i]);
            
            h.put(key , list);
        }
        
        return new ArrayList<>(h.values());
    }

    public static void main(String[] args) {
        String[] arr = {"act", "god", "cat", "dog", "tac"};
        System.out.println(anagrams(arr));
        
    }
}
