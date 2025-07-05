import java.lang.*; 

public class ProductExceptSelf {
    static int[] productExceptSelf(int arr[]) {
        // code here
       int res[] = new int[arr.length];
       int postProduct  = 1; 
       for(int i = arr.length-1; i>=0; i--){
           res[i] = postProduct;
           postProduct *= arr[i];
       }    
       int preProduct = 1; 
       for(int i = 0; i<arr.length; i++){
            res[i] *= preProduct;
            
            preProduct *= arr[i];
       }
       printArray(res);
       return res;
    }

    static void printArray(int [] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + ", " );
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {10 , 0};
        System.out.println(productExceptSelf(arr));
    }
}
