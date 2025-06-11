import java.lang.*;

public class SearchInSortedMatrix {
    static boolean searchMatrix(int[][] arr, int x) {
        int n = arr.length;
        int m = arr[0].length;
        int s = 0; 
        int e = m*n -1;
        
        while(s<=e){
            int mid = s + (e-s)/2;
            int rowIndex = mid / m;
            int colIndex = mid % m;
            
            if(arr[rowIndex][colIndex] == x) return true;
            else if(arr[rowIndex][colIndex] < x) s = mid +1;
            else e = mid -1;
        }
        
        return false;
        
    }
    public static void main(String[] args) {
        int arr[][] = {{1, 5, 9},{14,20,21},{30,34,43}};
        System.out.println(searchMatrix(arr, 14));
    }
}
