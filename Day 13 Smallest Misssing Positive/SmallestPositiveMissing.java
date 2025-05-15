import java.lang.*;


public class SmallestPositiveMissing {

    static int findSmallest(int arr[]){
        int smallestPositive = Integer.MAX_VALUE;
        for(int i = 0; i<arr.length ; i++){
            if(arr[i] > 0){
                if(smallestPositive > arr[i])
                {
                    smallestPositive = arr[i];
                }
            }
        }

        int i = 0; 
        
        while(i < arr.length){
            if(arr[i] == smallestPositive + 1){
                smallestPositive = arr[i];
                i = 0;
            }
            else{
                i++;
            }
        }
        if(smallestPositive == Integer.MAX_VALUE){
            return 1;
        }
        return smallestPositive+1;
    }
    public static void main(String args[]){
        int arr[] = {5, 3, 2, 5, 1};

        System.out.println(findSmallest(arr));
    }
}
