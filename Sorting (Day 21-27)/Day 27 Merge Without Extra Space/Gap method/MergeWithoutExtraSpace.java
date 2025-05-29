
public class MergeWithoutExtraSpace {

    // Function to calculate next gap
    private static int nextGap(int gap) {
        if (gap <= 1) return 0;
        return (gap / 2) + (gap % 2); // Ceil of gap/2
    }

    public static void swap(int arr1[] , int arr2[] , int i , int j){
        int temp= arr1[i];
        arr1[i] = arr2[j];
        arr2[j] = temp;
    }

    public static void swapIfGreater(int arr1[] , int arr2[] , int i , int j){
        if(arr1[i] > arr2[j]){
            swap(arr1, arr2, i, j);
        }
    }
 
    public static void merge(int[] arr1, int[] arr2) {
        int len = arr1.length + arr2.length;
        int gap = len /2 + (len %2 );

        while(gap > 0){
            int i = 0; 
            int j = i + gap;
            while(j < len){
                // arr1 and arr2 
                if(i < arr1.length && j >= arr1.length){
                    swapIfGreater(arr1 , arr2 , i , j-arr1.length);
                }
                // both in arr2
                else if(i >= arr1.length ){
                    swapIfGreater(arr2, arr2, i-arr1.length, j-arr1.length);
                }
                // both in arr1
                else{
                    swapIfGreater(arr1 , arr1 , i , j);
                }
                i++; j++;
            }
            if(gap == 1) break;
            gap = gap/2 + (gap % 2);
        }

        printArray(arr1);
        printArray(arr2);
    }

    private static void printArray(int[] arr) {
        for (int val : arr) System.out.print(val + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 5, 9, 10, 15, 20};
        int[] arr2 = {2, 3, 8, 13};

        merge(arr1, arr2);
    }
}
