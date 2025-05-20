import java.lang.*;
import java.util.*;


public class SearchPattern {

    static ArrayList<Integer> searchPatternSubString(String s , String pat){
        int j = 0;
        boolean isSubString = false;

        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0;
        while(i<s.length()){
            System.out.println(j + " " + i + " " + ans);
            
            if(j>=pat.length()-1){
                j = 0;
            }
            
            if(s.charAt(i) == pat.charAt(j))
            {
                j++;
                isSubString = true;
            }
            else{
                j = 0; 
                isSubString = false;
            }


            if(j == pat.length()-1 || j == pat.length()){
                if(isSubString){
                    if(j>pat.length()-1)
                    {
                        ans.add(i-j+2);
                    }
                    else
                        ans.add(i-pat.length()+2);
                    i--;
                    
                }
            }
            i++;
        }
        System.out.println(ans);

        return ans;
    }

    static ArrayList<Integer> searchPatternSubString2(String s , String pat){
        ArrayList<Integer> ans = new ArrayList<>();
        int n = s.length();
        int m = pat.length();

        for (int i = 0; i <= n - m; i++) {
            if (s.substring(i, i + m).equals(pat)) {
                ans.add(i ); // 1-based index
            }
        }

        System.out.println(ans);
        return ans;
    }
    public static void main(String args[]){
        String s = "ke";
        String pat = "e";

        searchPatternSubString2(s, pat);
    }
}
