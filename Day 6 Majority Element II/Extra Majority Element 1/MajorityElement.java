import java.lang.*;

public class MajorityElement {

    static int findMajorityElements(int arr[]){
       int cnt = 0; 
       int el = -1;
       for(int i = 0; i<arr.length; i++){
        if(cnt == 0){
            cnt = 1; 
            el = arr[i];
        }
        else if(arr[i] == el){
            cnt++;
        }
        else{
            cnt--;
        }
       }
       int count = 0;
       for(int i = 0; i<arr.length; i++){
            if(el == arr[i]){
                count++;
            }
       }
       if(count > arr.length/2){
        return el;
       }
       return -1;
    }
    public static void main(String[] args) {
        int arr[] = {-5, 1 };

        System.out.println(findMajorityElements(arr));
        // findMajorityElements(arr);
    }
}
