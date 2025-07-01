import java.lang.*;

public class ContainerWithMostWater {
    static int maxWater(int arr[]) {
        // Code Here
        int l = 0; 
        int r = arr.length-1;
        int maxArea = 0; 
        while(l<r){
            int length = r -l;
            int height = Math.min(arr[r] , arr[l]);
            int area = length * height;
            
            if(area > maxArea) maxArea = area;
            
            if(arr[l] < arr[r]){
                l++;
            }
            else r--;
        }
        return maxArea;
    }
    public static void main(String[] args) {
        int arr[] = {1 , 5, 4, 3};

        System.out.println(maxWater(arr));
        
    }
}
