import java.lang.*;
import java.util.*;

public class Sort0s1s2s {

    static void swap(Vector<Integer> v  , int i , int j){
        int temp = v.get(i);
        v.set(i , v.get(j));
        v.set(j , temp);
    }
    static Vector<Integer> sort0s1s2s(Vector<Integer> v){
        int n = v.size();
        System.out.println(n);
        int i = 0; 
        int start = 0; 
        int j = n-1;
        while(i<=j){
            if(v.get(i) == 0){
                swap(v , i , start);
                i++;
                start++;
            }
            else if(v.get(i) == 2){
                swap(v , i , j);
                j--;
            }
            else{
                i++;
            }

        }
        System.out.println(v);
        return v;
    }
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.add(0);
        v.add(1);
        v.add(1);
        v.add(0);
        v.add(1);
        v.add(2);
        v.add(1);
        v.add(2);
        v.add(0);
        v.add(0);
        v.add(0);
        v.add(1);

        System.out.println(sort0s1s2s(v));
    }
}
