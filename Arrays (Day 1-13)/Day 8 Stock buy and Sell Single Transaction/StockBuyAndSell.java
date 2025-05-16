import java.lang.*;

public class StockBuyAndSell {
    static int maximumProfit(int arr[]){
        int totalProfit = 0; 
        
        for(int i =0; i<arr.length-1; i++){
            int j = i+1;
            while(j < arr.length &&  arr[j] > arr[i] ){
                if(totalProfit < arr[j]-arr[i]){
                    totalProfit = arr[j] - arr[i];
                }
                j++;
            }
        }
        
        return  totalProfit;
    }
    public static void main(String[] args) {
        int arr[] = {6 , 9 , 5, 3, 2, 6, 6, 4};
        System.out.println(maximumProfit(arr));
        
    }
}
