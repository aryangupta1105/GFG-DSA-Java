import java.lang.*;

public class TrappingRainWater {
    static int maxWater(int arr[]) {
        int leftMax = 0; 
        int rightMax = 0; 
        int total = 0; 
        int l = 0; 
        int r = arr.length-1;
        
        while(l<r){
            if(arr[l] <= arr[r]){
                if(leftMax > arr[l]){
                    total += leftMax - arr[l];
                }
                else leftMax = arr[l];
                l++;
            }
            else{
                if(rightMax > arr[r]){
                    total += rightMax - arr[r];
                }
                else{
                    rightMax = arr[r];
                }
                r--;
            }
        }
    return total;
    }

    public static void main(String[] args) {
        int arr[] = {3, 0, 1, 0, 4, 0, 2};

        System.out.println(maxWater(arr));
    }
}
