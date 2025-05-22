import java.lang.*;


public class StringsRotations {

     static int[] computeLps(String s1){
        int len = 0; 
        int i = 1; 
        int [] lps = new int[s1.length()];
        while(i<s1.length()){
            if(s1.charAt(i) == s1.charAt(len)){
                len++;
                lps[i] = len; 
                i++;
            }
            else{
                if(len != 0){
                    len = lps[len-1];
                }else{
                    lps[i] = len;
                    i++;
                }
            }
        }
        return lps;
    }
    
    static boolean kmp(String text , String s1){
        int i = 0; 
        int j = 0; 
        int n = text.length();
        int m = s1.length();
        int[] lps = computeLps(s1);
        while(i<n){
            if(text.charAt(i) == s1.charAt(j) ){
                i++;
                j++;
                if(j == m){
                    return true;
                }
            }
            else{
                if(j != 0){
                    j = lps[j-1];
                }
                else{
                    i++;
                }
            }
        }
        return false;
    }
    // Function to check if two strings are rotations of each other or not.
    public static boolean areRotations(String s1, String s2) {
        if(s1.length() != s2.length()){
            return false;
        }
        String concat = s2 + s2;
        return kmp(concat , s1);
    }
    public static void main(String[] args) {
        String s1 = "geeksforgeeks";
        String s2 = "forgeeksgeeks";
        
        System.out.println(areRotations(s1, s2));
    }
}
