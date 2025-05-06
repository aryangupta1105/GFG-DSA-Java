import java.lang.*;

public class RotateArray {
    static void rotateAnArray(int arr[] , int d){
        int i = 0; 
        int itr = d % arr.length;

        while(itr != 0){
            int temp = arr[0]; 
            for( i = 0; i<arr.length -1 ; i++){
                arr[i] = arr[i+1];
            }
            arr[i] = temp;
            itr--;
        }
    }

    static void printArray(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    
    public static void main(String[] args) {
        int arr[] = {2, 4 ,6,8 ,10, 12 ,14, 16, 18 ,20};

        printArray(arr);

        rotateAnArray(arr, 3);
        printArray(arr);

    }
}
