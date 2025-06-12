import java.lang.*;


// works only for binary input: 

public class SetMatrixZeroes {

    static void setZero(int arr[][] , int i , int j){
        for(int k = 0; k<arr[i].length; k++){
            if(arr[i][k] != 0)
                arr[i][k] = Integer.MIN_VALUE;
        }

        for(int k = 0; k<arr.length; k++){
            if(arr[k][j] != 0)
            arr[k][j] = Integer.MIN_VALUE;
        }
    }

    static void setMatrixZeroes(int arr[][]){
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                if(arr[i][j] == 0){
                    setZero(arr, i , j);
                }
            }
        }

        printArray(arr);

        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                if(arr[i][j] == Integer.MIN_VALUE){
                    arr[i][j] = 0;
                }
            }
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
        int arr[][] = {{1, -1, 1}, {-1, 0, 1}, {1, -1, 1}};

        setMatrixZeroes(arr);
    }
}
