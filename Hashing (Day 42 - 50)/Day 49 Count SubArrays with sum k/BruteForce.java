

public class BruteForce {

    static int countMaxSubArrays(int arr[] , int target){
        int count = 0; 
        for(int i = 0; i<arr.length; i++){
            int sum  = arr[i];
            for(int j = i+1; j<arr.length; j++){
                sum += arr[j]; 
                if(sum == target )
                    count++;
            }
        }

        return count;
    }

   
    public static void main(String[] args) {
        int arr[] = {10 , 2 , -2 , -20 , 10} ; 
        System.out.println(countMaxSubArrays(arr, -10));
    }
    
}
