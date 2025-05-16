import java.lang.*;


public class MaxProdSubArray {

    static int maxProduct(int arr[]){
        int maxProduct = 1; 
        for(int i = 0; i<arr.length; i++){
            int newProd = 1;
            for(int j = i; j<arr.length; j++){
                newProd *= arr[j];
                if(newProd > maxProduct){
                    maxProduct = newProd;
                }
            }
        }

        System.out.println(maxProduct);
        return maxProduct;
    }
    public static void main(String args[]){
        int arr[] = {-1, -3, -10, 0, 6};
        System.out.println(maxProduct(arr));
    }
}
