import java.lang.*;


public class NextPermutation {
    static void swap(int arr[] , int i , int j)
    {
        int temp = arr[i]; 
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverseArr(int arr[] , int s , int e){
        while(s<e){
            swap(arr , s , e);
            s++;
            e--;
        }
    }

    static void findNextPermutation(int arr[]){
        int n = arr.length-1;
        int pivot = -1;
        for(int i = n; i>0; i--){
            if(arr[i-1] < arr[i])
            {
                pivot = i-1;
                break;
            }
        }

        if(pivot != -1){
            int nextGreater = Integer.MAX_VALUE;
            int nextGreaterIndex = -1;
            for(int i = pivot+1; i<arr.length; i++){
                if(arr[i] > arr[pivot] && arr[i] < nextGreater)
                {
                    nextGreater = arr[i];
                    nextGreaterIndex = i;
                }
            }
            System.out.println(nextGreater);
            if(nextGreaterIndex != -1){
                swap(arr, pivot, nextGreaterIndex);
            }
        }
        
        reverseArr(arr, pivot+1, n);
    }

    static void printArray(int arr[]){
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    

    public static void main(String[] args) {
        int arr[] = {1, 3 , 2};
        printArray(arr);
        findNextPermutation(arr);
        printArray(arr);

        
    }
}
