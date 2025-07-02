import  java.lang.*;

public class EquilibriumPoint {
    static int findEquilibrium(int arr[]) {
        // code here
        int ans = -1;
        int totalSum = 0;
        for(int i = 0; i<arr.length; i++){
            totalSum += arr[i];
        }
         
        int leftSum = 0; 
        for(int i =0; i<arr.length; i++){
            int rightSum = totalSum - leftSum- arr[i];
            if(rightSum == leftSum){
                return i;
            }
            leftSum += arr[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1 , 2 ,0 , 3};
        System.out.println(findEquilibrium(arr));
        
    }
}
