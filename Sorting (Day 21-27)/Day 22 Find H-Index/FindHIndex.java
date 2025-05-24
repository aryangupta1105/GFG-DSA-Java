import java.lang.*;


public class FindHIndex {
    static int findHINdex(int arr[]){
        int n = arr.length;
         int[] count = new int[n + 1];

        for (int c : arr) {
            if (c >= n) count[n]++;
            else count[c]++;
        }
        
        int sum = 0;
        int hIndex = 0;
        for(int i = count.length-1; i>=0; i--){
            sum += count[i];
            if(sum >= i){
                hIndex = i;
                break;
            }
        }
        return hIndex;
    }
    public static void main(String[] args) {
        int arr[] = {3, 0, 5, 3, 0 , 90 , 110 , 200};
        System.out.println(findHINdex(arr));

    }
}
