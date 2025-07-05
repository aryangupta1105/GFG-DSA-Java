import java.lang.*;

public class RotateByReversing {

    static void printArray(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    static void swap(int arr[] , int i , int j){
        int temp = arr[i]; 
        arr[i] = arr[j]; 
        arr[j] = temp;
    }
    
    static void reverse(int arr[] , int s , int e){
        while(s<e){
            swap(arr , s , e); 
            s++; 
            e--;    
        }
    }
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        d = d % arr.length; 
        reverse(arr , 0 , arr.length-1);
        reverse(arr , 0 , arr.length - d -1);
        reverse(arr , arr.length-d , arr.length-1);
    }
    
    public static void main(String[] args) {
        int arr[] = {2, 4 ,6,8 ,10, 12 ,14, 16, 18 ,20};

        printArray(arr);

        rotateArr(arr, 3);
        printArray(arr);

    }
}
 