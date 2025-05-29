import java.lang.*;
import java.util.Arrays;


public class MergeWithoutExtraSpace {

    static void swap(int arr [], int arr2 [], int i , int j ){
        int temp = arr[i]; 
        arr[i] = arr2[j];
        arr2[j] = temp;
    }

    static void merge(int arr[] , int arr2[]){
        for(int j = 0; j<arr2.length ; j++){
            int i = 0; 
            while(i<arr.length){
                if(arr2[j] < arr[i]){
                    swap(arr , arr2 , i , j);
                } 
                i++;
            }
        }

        Arrays.sort(arr2);

        printArray(arr);
        printArray(arr2);
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
