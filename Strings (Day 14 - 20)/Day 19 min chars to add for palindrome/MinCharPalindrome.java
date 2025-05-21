import java.lang.*;

public class MinCharPalindrome {
    static int[] computeLps(String s){
        int i = 1; 
        int len = 0;
        int m = s.length();
        int lps [] = new int[m];

        while(i<m){
            if(s.charAt(i) == s.charAt(len))
            {
                len++;
                lps[i] = len;
                i++;
            }
            else{
                if(len != 0){
                    len = lps[len-1];
                }
                else{
                    lps[i] = len;
                    i++;
                }
            }
        }
        return lps;
    }

    


    static int findMinChars(String s){
        String rev = new StringBuilder(s).reverse().toString();
        String concat = s + "*" + rev;
        int lps[] = computeLps(concat);
        return s.length() - lps[lps.length-1];
    }
    public static void main(String[] args) {
        String s = "abacdfgdcaba";
        System.out.println(findMinChars(s));

    }
}
