import java.lang.*;
import java.util.Vector;


public class CountInversions {

    static void merge(int arr[] , int l , int h , int mid , int[] invCount){
        Vector<Integer> v = new Vector<>();

        int i = l; 
        int j = mid+1;
        int count = 0;
        while(i <= mid && j <= h){
            if(arr[i] <= arr[j]){
                v.add(arr[i]);
                i++;
            }
            else{
                invCount[0] += mid - i +1;
                System.out.println(arr[i] + " " + arr[j]);
                v.add(arr[j]);
                j++;
            }
        }

        while(i<= mid){
            v.add(arr[i]);
            i++;
        }
        
        while(j<= h){
            v.add(arr[j]);
            j++;
        }

        for (int k = 0; k < v.size(); k++) {
            arr[l + k] = v.get(k);
        }

    }

    static void printArray(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void mergeSort(int arr[] , int l , int h , int[] invCount){
        if(l == h){
            return;
        }

        int mid = (l+h)/2;

        mergeSort(arr, l, mid , invCount);
        mergeSort(arr, mid+1 , h , invCount);

        merge(arr , l , h , mid , invCount);
    }
    public static void main(String[] args) {
        int arr[] = {2 , 4 , 1 , 3, 5};
        int[] invCount = new int[1];
        printArray(arr);
        mergeSort(arr, 0 ,  arr.length-1 , invCount);
        printArray(arr);
        System.out.println(invCount[0]);

    }
}
