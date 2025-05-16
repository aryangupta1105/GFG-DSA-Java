import java.lang.*;


public class StockBuyAndSell {
    static int maximumProfit(int arr[]){
        int totalProfit = 0; 
        for(int i = 0; i<arr.length-1; i++){
            int j = i+1;
            if(arr[j] > arr[i]){
                totalProfit += arr[j] - arr[i];
            }
        }
        
        return  totalProfit;
    }
    public static void main(String[] args) {
        int arr[] = {4, 2, 2, 2, 4};
        System.out.println(maximumProfit(arr));
        
    }
}
