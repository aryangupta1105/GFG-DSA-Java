import java.lang.*;


public class SortedAndRotatedMinimum {
    static int findPivot(int arr[]){
         int s = 0; int e= arr.length-1;
        int ans = -1; 
        int mid = s + (e-s)/2;
        
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

    static int findMin(int arr[]){
        if(arr[0] < arr[arr.length-1]) return arr[0];
        else if(arr.length == 1) return arr[0];
        else{
            int pivot = findPivot(arr);
            return arr[pivot+1];
        }
    }

    public static void main(String[] args) {
        int arr[] = {10 , 1, 2, 3,4, 5, 6};

        System.out.println(findMin(arr));
    }
}
