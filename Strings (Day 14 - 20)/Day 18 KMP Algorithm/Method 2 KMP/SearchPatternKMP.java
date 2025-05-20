import  java.lang.*;
import java.util.ArrayList;


public class SearchPatternKMP {

    static int[] computeLps(String pat){
        int len = 0; 
        int i = 1;
        int lps[] = new int[pat.length()];
        
        while(i<pat.length()){
            if(pat.charAt(i) == pat.charAt(len)){
                len++;
                lps[i] = len;
                i++;
            }
            else{
                if(len != 0){
                    len = lps[len-1];
                }
                else{
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }
    
    static ArrayList<Integer> search(String s, String pat) {
        int i = 0; 
        int j = 0; 
        int m= pat.length();
        int n = s.length();
        int lps[] = computeLps(pat);
        ArrayList<Integer> ans = new ArrayList<>();
        while(i<n){
            if(s.charAt(i) == pat.charAt(j)){
                i++;
                j++;
            }
            if(j == m){
                ans.add(i-j);
                j = lps[j-1];
            }
            else if(i<n && s.charAt(i) != pat.charAt(j)){
                if(j != 0){
                    j = lps[j-1];
                }
                else{
                    i++;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        String pat = "geek";
        System.out.println(search(s, pat));
    }
}
