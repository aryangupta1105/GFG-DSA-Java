import java.lang.*;

public class SearchRotatedSorted {
    static int binarySearch(int arr[] , int s , int e , int target){
        while(s<=e){
            int mid = s + (e-s)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] > target){
                e = mid-1;
            }
            else{
                s = mid + 1;
            }
        }

        return -1;
    }

    static int findPivot(int arr[]){
        int s = 0; int e= arr.length-1;
        int ans = -1; 
        int mid = s + (e-s)/2;

        if (arr[s] <= arr[e]) return -1;
        
        while(s <= e){
            if(s==e) return s; 
            if(mid<=e  && arr[mid+1] < arr[mid]) return mid;

            if(mid-1>=s && arr[mid-1] > arr[mid]) return mid-1;
            
            if(arr[mid] < arr[s]){
                e = mid-1;
            }
            else s = mid+1;
            
            
            mid = s + (e-s)/2;
        }
        
        return -1;
    }


    static int search(int arr[] , int target){

        int pivotIndex = findPivot(arr);
        System.out.println(pivotIndex);
        if(pivotIndex == -1) return binarySearch(arr, 0, arr.length-1, target);

        if(target > arr[arr.length-1]){
            return binarySearch(arr, 0, pivotIndex, target);
        }
        else{
            return binarySearch(arr, pivotIndex+1, arr.length-1, target);
        }


    }
    public static void main(String[] args) {
        int arr[] = {1, 2 ,3 , 4};
        int target = 4;

        System.out.println(arr[search(arr, target)] + " index: "  + search(arr, target));


    }
}
