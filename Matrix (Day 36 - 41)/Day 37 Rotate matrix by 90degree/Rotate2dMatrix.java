import java.lang.*;


public class Rotate2dMatrix {

    

    static void transpose(int arr[][])
    {
        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr[0].length; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        printArray(arr);
    }

    static void rowReverse(int arr[][]){
         int n = arr.length;
        for (int j = 0; j < n; j++) {
            int top = 0, bottom = n - 1;
            while (top < bottom) {
                int temp = arr[top][j];
                arr[top][j] = arr[bottom][j];
                arr[bottom][j] = temp;
                top++;
                bottom--;
            }
        }
    }

    static void rotate(int arr[][]){
        transpose(arr);
        printArray(arr);

        rowReverse(arr);
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
        int arr[][] = {{1, 2, 3} , {4, 5, 6} , {7, 8, 9}};
        rotate(arr);

    }
}
