import java.lang.*;

public class RowColumnSortedMatrix {

    static boolean search(int arr[][] , int x){
        int m = arr.length;
        int n = arr[0].length;
        int i = 0; int j = n-1;
        while(i<m && j>=0){
            if(arr[i][j] == x) return true;
            else if (arr[i][j] > x) j--;
            else i++;
        }
        
        return false;
    }
    public static void main(String[] args) {
        int arr[][] = {{3, 30, 38} , {20, 52, 54} , {35, 60, 69}};

        System.out.println(search(arr, 62));
    }
}
