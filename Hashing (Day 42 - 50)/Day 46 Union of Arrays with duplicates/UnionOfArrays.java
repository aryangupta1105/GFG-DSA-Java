import java.lang.*;
import java.util.HashMap;

public class UnionOfArrays {
  static int findUnion(int a[], int b[]) {
        HashMap<Integer, Integer> h  = new HashMap<>();
        for(int i = 0; i<a.length; i++){
            h.put(a[i] , h.getOrDefault(h.get(a[i]) , 0) + 1);
        
        }
        for(int i = 0; i<b.length; i++){
            h.put(b[i] , h.getOrDefault(h.get(b[i]) , 0) + 1);
        }
        
        return h.size();
    }
    public static void main(String[] args) {
        int a[] = {1 , 2, 3, 4, 5};
        int b[] = {1 , 2};

        System.out.println("Unique Elements : " + findUnion(a, b));
    }
}
