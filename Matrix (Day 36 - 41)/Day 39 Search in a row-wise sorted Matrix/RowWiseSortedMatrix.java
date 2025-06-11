
public class RowWiseSortedMatrix {
    static boolean bS(int arr[][] , int i , int m , int target){
        int s = 0;
        int e = m-1;
        while(s<=e){
            int mid = s + (e-s)/2;
            if(target == arr[i][mid]) return true;
            else if(arr[i][mid] < target){
                s  = mid+1;
            }
            else e = mid-1;
        }
        return false;
    }
    // Function to search a given number in row-column sorted matrix.
    static boolean searchRowMatrix(int[][] arr, int x) {
        int m = arr[0].length;
        for(int i = 0; i<arr.length; i++){
            if(bS(arr , i , m , x)) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[][] = {{3, 4, 9} , {2, 5, 6} , {9, 25, 27}};
        System.out.println(searchRowMatrix(arr, 11));
    }
}
