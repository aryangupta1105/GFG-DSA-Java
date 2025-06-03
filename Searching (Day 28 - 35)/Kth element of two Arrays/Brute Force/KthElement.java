import java.lang.*;


public class KthElement {

    static int findKthElement(int a[] , int b[] , int k){
        int i = 0; 
        int j = 0; 
        int n = a.length;
        int m = b.length;
        int ans = -1;
        if(k > m +n) return -1;
        while(k!=0){
            if(i<n && j<m){
                if(a[i] < b[j]){
                ans= a[i];
                i++;
                }
                else{
                    ans = b[j];
                    j++;
                }
            }
            else if(j<m){
                if(j + k -1 < m)
                    ans = b[j + k -1] ;
                else ans = -1;
                break;
            }
            else{
                if(i + k -1 < n)
                    ans = a[i + k - 1] ;
                else ans = -1;
                break;
            }
            System.out.println(i + " " + j + " " + ans);
            k--;
        }
        return ans;
    }
    public static void main(String[] args) {
        int b[] = {1, 4, 8, 10};
        int a[] = {2, 3, 6, 7, 9};
        System.out.println(findKthElement(a,b , 9));
    }
}
