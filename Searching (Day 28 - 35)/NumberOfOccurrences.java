import java.lang.*;

public class NumberOfOccurrences {

    static int firstOccurrence(int arr[] , int target){
        int s = 0; 
        int e = arr.length-1;
        int ans = -1;
        
        while(s<=e){
            int mid = s + (e-s)/2;

            if(arr[mid] == target){
                ans = mid;
                e = mid-1;
            }
            else if(arr[mid] < target){
                s = mid + 1;
            }
            else{
                e = mid-1;
            }

        }

        return ans;
    }
    static int lastOccurrence(int arr[] , int target){
        int s = 0; 
        int e = arr.length-1;
        int ans = -1;
        
        while(s<=e){
            int mid = s + (e-s)/2;

            if(arr[mid] == target){
                ans = mid;
                s = mid+1;
            }
            else if(arr[mid] < target){
                s = mid + 1;
            }
            else{
                e = mid-1;
            }

        }

        return ans;
    }

    static int totalOccurrence(int arr[] , int target){
        int f = firstOccurrence(arr, target);
        int l = lastOccurrence(arr, target);

        if(f != -1 || l != -1)
            return l-f +1;

        return 0;
    }
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 2, 2, 3}; 
        int target = 4;

        System.out.println(totalOccurrence(arr, target));

    }
}
