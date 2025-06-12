import java.lang.*;

public class Optimized {

    static void setMatrixZeroes(int[][] arr) {
    int rows = arr.length, cols = arr[0].length;
    boolean col0 = false;

    // First pass: use first row/column as markers
    for(int i = 0; i < rows; i++) {
        if(arr[i][0] == 0) col0 = true;
        for(int j = 1; j < cols; j++) {
            if(arr[i][j] == 0) {
                arr[i][0] = 0;
                arr[0][j] = 0;
            }
        }
    }

    // Second pass: set zeroes using markers (bottom-up to avoid overwriting markers)
    for(int i = rows - 1; i >= 0; i--) {
        for(int j = cols - 1; j >= 1; j--) {
            if(arr[i][0] == 0 || arr[0][j] == 0) {
                arr[i][j] = 0;
            }
        }
        if(col0) arr[i][0] = 0;
    }
    printArray(arr);
}


    static void printArray(int arr[][]){
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        // int arr[][] = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        int arr[][] = {{1 , 1 , 5},{0 , -1 , -1}};

        setMatrixZeroes(arr);
    }
}
