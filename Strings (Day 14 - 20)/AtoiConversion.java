public class AtoiConversion {

    static int AtoiConversion(String s){
        StringBuilder number = new StringBuilder();
        int i = 0;
        int n = s.length();
        boolean isNegative = false;

        // Skip leading whitespaces
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // Handle optional sign
        if (i < n && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
            if (s.charAt(i) == '-') {
                isNegative = true;
            }
            i++;
        }
        int result = 0;
        // Read digits
         while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';
            
            // Check for overflow/underflow before multiplying or adding
            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }

            result = result * 10 + digit;
            i++;
        }

        return isNegative ? -result : result;
    }

    public static void main(String[] args) {
        String s = "-121 09g235";
        System.out.println(AtoiConversion(s)); // Output should be: -121
    }
}
