import java.util.*;

public class CountTriangles {
    static int countTriangles(int arr[]) {
        int count = 0; 
        Arrays.sort(arr);
        for(int i = arr.length-1; i>=2; i--){
            int s = 0;
            int e = i-1;
            while(s<=e){
                if(arr[e] + arr[s] > arr[i])
                {
                    count += e-s;
                    e--;
                }
                else{
                    s++;
                
                }
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        int arr[] = {4, 6, 3, 7};
        System.out.println(countTriangles(arr));
    }
}

