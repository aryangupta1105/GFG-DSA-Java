
public class PairSum {
    static int countPairs(int arr[], int target) {
        int s = 0; 
        int e = arr.length-1; 
        int count = 0; 
        
        while(s<e){
            int sum = arr[s] + arr[e];
            if(sum == target){
                if(arr[s] == arr[e]){
                    int len = e - s + 1; 
                    count += (len * (len-1))/2;
                    break;
                }
                else{
                    int countS = 1; 
                    int countE = 1; 
                    while(s < e-1 && arr[s] == arr[s+1]){
                        countS++;
                        s++;
                    }
                    while(s+1 < e && arr[e] == arr[e-1]){
                        countE++;
                        e--;
                    }
                    
                    count += countS * countE;
                }
                s++;
                e--;
            }
            else if(sum < target){
                s++;
            }
            else{
                e--;
            }
        }
        return count; 
    }
    public static void main(String[] args) {
        int arr[] = {-1, 1, 5, 5, 7};
        System.out.println(countPairs(arr, 6));
    }
}
