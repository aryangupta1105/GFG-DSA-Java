public class PowerOfE {
    double power(double b, int e) {
        // code here
        double result = 1.0; 
        long exponent = e; 
        if(exponent <0){
            b = 1/ b; 
            exponent = -exponent; 
        }
        
        while(exponent >0){
            if((exponent & 1)==1){
                result *= b;
            }
            b*=b; 
            exponent >>=1;
        }
        return result; 
    }

    public static void main(String args[]){
        PowerOfE e = new PowerOfE(); 
        System.out.println(e.power(3, 5));
    }
}
