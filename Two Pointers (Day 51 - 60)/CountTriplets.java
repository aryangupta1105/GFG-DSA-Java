
public class CountTriplets {
    static int countTriplets(int[] arr, int target) {
        int count = 0; 
        
        for(int i = 0; i<arr.length-2; i++){
            int s = i+1; 
            int e = arr.length-1;
            int currSum = target - arr[i];
            while(s<e){
                if(arr[s] + arr[e] == currSum){
                    if(arr[s] == arr[e]){
                        int len = e - s + 1; 
                        count += (len * (len-1))/2;
                        break;
                    }
                    else{
                        int countS = 1; 
                        while(s < e-1 && arr[s] == arr[s+1]){
                            countS++;
                            s++;
                        }
                        
                        int countE = 1; 
                        while(e > s+1 && arr[e] == arr[e-1]){
                            countE++;
                            e--;
                        }
                        
                        count += countS * countE;
                    }
                    s++;
                    e--;
                }
                else if(arr[s] + arr[e] > currSum){
                    e--;
                }
                else{
                    s++;
                }
            }
        }
        
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {1 ,1,1,1,1,1};
        int target = 3;
        System.out.println(countTriplets(arr, target));
    }
}
