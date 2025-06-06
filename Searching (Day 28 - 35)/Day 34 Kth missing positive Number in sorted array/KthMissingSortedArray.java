import java.lang.*;


public class KthMissingSortedArray {

    static  int kthMissing(int[] arr, int k) {
        int s = 0;
        int e = arr.length - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;
            int diff = arr[mid] - (mid + 1);  // number of missing elements before arr[mid]

            if (diff < k) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }

        // The kth missing number is s + k
        return s + k;
    }


    public static void main(String args[]){
        int arr[] = { 2, 3 , 5, 6};
        int k = 2;
        System.out.println(kthMissing(arr, k));
    }
}
