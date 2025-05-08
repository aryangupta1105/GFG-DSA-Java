import java.lang.*;
import java.util.*;

public class MajorityElement {

    static List<Integer> findMajorityElements(int arr[]){
        List<Integer> ans = new ArrayList<>();
        int vCount = arr.length / 3;
        int count1 = 0; 
        int count2 = 0; 
        int majority1 = Integer.MIN_VALUE;
        int majority2 = Integer.MIN_VALUE;

        for(int i = 0; i<arr.length; i++){
            if(count1 == 0 && majority2 != arr[i])
            {
                count1 = 1; 
                majority1 = arr[i];
            }
            // so that both of the majority elements are not same: 
            else if(count2 == 0 && majority1 != arr[i])
            {
                count2 = 1; 
                majority2 = arr[i];
            }
            else if(majority1 == arr[i])
            {
                count1++;
            }
            else if(majority2 == arr[i])
            {
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }
        int check1 = 0; 
        int check2 = 0; 
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == majority1){
                check1++;
            }
            if(arr[i] == majority2){
                check2++;
            }
        }
        System.out.println(check1);
        System.out.println(check2);
        System.out.println(majority1);
        System.out.println(majority2);
        if(check1 > arr.length/3 && check2 > arr.length/3){
            if(majority1 > majority2)
            {   ans.add(majority2);
                ans.add(majority1);
            }
            else{
                ans.add(majority1);
                ans.add(majority2);
            }
        }
        else if(check1 >arr.length/3){
            ans.add(majority1);
        }
        else if(check2 > arr.length/3){
            ans.add(majority2);
        }
        

        System.out.println(ans);
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1 , 2, 3, 4, 5};

        findMajorityElements(arr);
    }
}
