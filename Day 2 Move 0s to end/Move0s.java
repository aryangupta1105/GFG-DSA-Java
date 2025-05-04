import java.lang.*;

public class Move0s {
    static void swap(int [] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void pushZerosToEnd(int[] arr) {
        // code here
        int i = 0; 
        int j = i+1;
        while(j<arr.length){
            if(arr[i] == 0 && arr[j] != 0){
                swap(arr , i , j);
                i++; j++;
            }
            else if(arr[i] ==0 && arr[j] == 0){
                j++;
            }
            else{
                i++;
                j++;
            }
        }
    }

    static void printArray(int arr[])
    {
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 0, 4, 3, 0, 5, 0};

        printArray(arr);
        pushZerosToEnd(arr);

        System.out.println("Moving 0s to end without changing the order:");
        printArray(arr);


    }
}   
