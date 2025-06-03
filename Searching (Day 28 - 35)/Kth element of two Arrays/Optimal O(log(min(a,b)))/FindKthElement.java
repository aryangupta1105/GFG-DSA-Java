import java.lang.*;


public class FindKthElement {

    static double findMedian(int a[] , int b[] , int k){
        int m  = a.length; 
        int n = b.length;

        int low = Math.max(0 , k-m); 
        int high = Math.min(k, n);

        if(m > n) return findMedian(b, a , k);
        
        

        while(low <=high){
            int midA = (low + high) / 2;
            int midB = k - midA;

            int leftA = (midA == 0) ? Integer.MIN_VALUE : a[midA - 1];
            int rightA = (midA == m) ? Integer.MAX_VALUE : a[midA];

            int leftB = (midB == 0) ? Integer.MIN_VALUE : b[midB - 1];
            int rightB = (midB == n) ? Integer.MAX_VALUE : b[midB];

            if (leftA <= rightB && leftB <= rightA) {
                return Math.max(leftA, leftB);
            } 
            else if (leftA > rightB) {
                high = midA - 1;
            } else {
                low = midA + 1;
            }
        }

        
        return -1;
    }
    public static void main(String[] args) {
        int a[] = {2 , 3, 6, 15};
        int b[] = {1 , 3, 4, 7, 10 , 12};
        System.out.println(findMedian(a, b , 5));
    }
}
