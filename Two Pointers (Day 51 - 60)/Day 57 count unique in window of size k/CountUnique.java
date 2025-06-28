import java.lang.*;
import java.util.*;

public class CountUnique {
    static ArrayList<Integer> countDistinct(int arr[], int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i<arr.length-k+1; i++){
            int j = i;
            HashSet<Integer> h = new HashSet<>();
            while(j<=i+k-1){
                h.add(arr[j]);
                j++;
            }
            ans.add(h.size());
        }   
        return ans;
    }

    static ArrayList<Integer> countDistinct2(int arr[], int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = arr.length;

        // Process the first window
        for (int i = 0; i < k; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        ans.add(map.size());
        System.out.println(map);
        // Slide the window
        for (int i = k; i < n; i++) {
            // Remove the element going out of the window
            int outElem = arr[i - k];
            map.put(outElem, map.get(outElem) - 1);
            if (map.get(outElem) == 0) {
                map.remove(outElem);
            }

            System.out.println(map);

            // Add the new element coming into the window
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            ans.add(map.size());
        }

        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 1, 3, 4, 2, 3};
        System.out.println(countDistinct2(arr, 4));
    }
}
