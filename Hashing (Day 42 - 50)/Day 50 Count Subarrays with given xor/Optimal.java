
import java.util.HashMap;


public class Optimal {

    static long subarrayXor(int arr[], int k) {
        // code here
        int count = 0; 
        int preXor  = 0; 
        HashMap<Integer, Integer> h = new HashMap<>();
        h.put(0 , 1);
        for(int i = 0; i<arr.length; i++){
            preXor ^= arr[i]; 
            int remove = preXor ^ k;
            if(h.containsKey(remove)){
                count += h.get(remove);
            }
            
            h.put(preXor , h.getOrDefault(preXor , 0 ) + 1); 
        }
        
        return count; 
    }
    public static void main(String[] args) {
        int arr[] = {4, 2, 2, 6, 4};
        System.out.println(subarrayXor(arr, 6));

    }
}
