import java.lang.*;
import java.util.*;


public class SmallestPositiveMissing {

    static void printArray(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

     static int findSmallestMissing2(int[] arr) {
        int n = arr.length;

        // Step 1: Place each number in its correct position
        for (int i = 0; i < n; i++) {
            while (
                arr[i] > 0 && arr[i] <= n && arr[arr[i] - 1] != arr[i]
            ) {
                int correctIndex = arr[i] - 1;
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            }
        }

        // Step 2: Find the first index where arr[i] != i + 1
        for (int i = 0; i < n; i++) {
            if (arr[i] != i + 1) {
                return i + 1;
            }
        }

        // If all values 1 to n are present
        return n + 1;
    }

    static int findSmallestMissing(int arr[]) {
        Arrays.sort(arr); // O(n log n)
        int minPositive = 1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == minPositive) {
                minPositive++;
            }
        }

    return minPositive;
}

    public static void main(String[] args) {
        int arr[] = {2, -3, 4, 1, 1, 7};

        System.out.println(findSmallestMissing2(arr));
    }
}
