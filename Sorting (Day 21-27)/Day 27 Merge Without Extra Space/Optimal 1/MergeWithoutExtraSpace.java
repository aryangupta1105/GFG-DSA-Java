import java.lang.*;
import java.util.*;

public class MergeWithoutExtraSpace {

    static void swap(int arr[] , int arr1[] , int i , int j){
        int temp = arr[i];
        arr[i] = arr1[j];
        arr1[j] = temp;
    }

    static void merge(int arr[] , int arr1[])
    {
        int j = 0; 
        int i = arr.length-1;

        while(i>=0 && j<arr1.length){
            if(arr[i] > arr1[j]){
                swap(arr, arr1, i, j);
                i--; j++;
            }
            else{
                break;
            }

        }

        Arrays.sort(arr);
        Arrays.sort(arr1);

        printArray(arr);
        printArray(arr1);

    }

    static void printArray(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {10, 11, 12};
        int arr2[] = {1,2, 3};

        merge(arr , arr2);
    }
}
