import java.lang.*;


public class ReverseArray {

    static void swap(int arr[] , int i , int j){
        int temp = arr[i]; 
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverseArray(int arr[]){
        int s = 0; 
        int e = arr.length - 1;
        while(s<=e){
            swap(arr , s , e);
            s++; 
            e--;
        }
    }

    static void printArray(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        int arr[]= {1, 4, 3, 2, 6, 5};

        printArray(arr);

        reverseArray(arr);

        printArray(arr);
    }
}
