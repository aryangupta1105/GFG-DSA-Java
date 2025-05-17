import java.lang.*; 


public class AddBinaryStrings {

    static String addBinaryStrings(String input0 , String input1){
    
    // Use as radix 2 because it's binary    
    int number0 = Integer.parseInt(input0, 2);
    int number1 = Integer.parseInt(input1, 2);

    int sum = number0 + number1;
    return Integer.toBinaryString(sum); //returns the answer as a binary value;
}
    public static void main(String[] args) {
        String s1 = "1101";
        String s2 = "111";

        System.out.println(addBinaryStrings(s2, s1));
    }
}
