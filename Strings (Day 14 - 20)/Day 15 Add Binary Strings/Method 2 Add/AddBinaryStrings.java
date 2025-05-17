import java.lang.*;


public class AddBinaryStrings {

    static void addBinaryStrings(String s1 , String s2){

        int i = s1.length()-1; 
        int j = s2.length()-1;
        int carry = 0;
        StringBuilder ans = new StringBuilder();

        while(i >= 0 && j >= 0){
            int d1 = (int)s1.charAt(i) - 48;
            int d2 = (int)s2.charAt(j) - 48;
            int sum = (d1 + d2 + carry);
            int digit = sum % 2;
            System.out.println(d1 + " " + d2 + " = " + sum+ "(" + carry + ")" + " = " + digit);
            ans.append(digit);
            carry = sum / 2;
            i--;    
            j--;
        }
        System.out.println(i);
        System.out.println(j);
        while(j >= 0){
            int d2 = (int)s2.charAt(j) - 48;
            int sum = d2 + carry;
            int digit = sum % 2;
            ans.append(digit);
            carry = sum / 2;

            j--;
        }
        while(i >= 0){
            int d1 = (int)s1.charAt(i) - 48;
            int sum = d1 + carry;
            int digit = sum % 2;
            System.out.println(d1 + " " + " = " + sum+ "(" + carry + ")" + " = " + digit);
            ans.append(digit);
            carry = sum / 2;

            i--;
        }

        if(carry != 0){
            ans.append(carry);
        }

        for(int k = ans.length()-1; k>=0; k--){
            if(ans.charAt(k) == '0'){
                ans.deleteCharAt(k);
            }
            else{
                break;
            }
        }

        ans = ans.reverse();

        String result = ans.toString();

        System.out.println(result);
    }
    public static void main(String[] args) {
        char a = '1';

        String s1 = "00100";
        String s2 = "010";
        addBinaryStrings(s1, s2);

        System.out.println((int)a);
    }
}
