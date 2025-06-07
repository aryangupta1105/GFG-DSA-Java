import java.lang.*;
import java.util.*;


public class SpiralPrintMatrix {

    static void spiralPrintMatrix(int arr[][]){
        int total = arr.length * arr[0].length; 
        int count = 0; 
        int startRow = 0; 
        int startCol = 0; 
        int endRow = arr.length-1; 
        int endCol = arr[0].length-1;
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        while(count < total){
            for(int i = startCol; i<=endCol &&  count < total; i++){
                ans.add(arr[startRow][i]);
                count++;
            }
            startRow++;
            
            for(int i = startRow; i<=endRow &&  count < total; i++){
                ans.add(arr[i][endCol]);
                count++;
            }
            endCol--;
            
            for(int i = endCol; i>=startCol &&  count < total; i--){
                ans.add(arr[endRow][i]);
                count++;
            }
            endRow--;
            
            for(int i = endRow; i>=startRow &&  count < total; i--){
                ans.add(arr[i][startCol]);
                count++;
            }
            startCol++;
        }
        
        System.out.println(ans);
    
    }
    public static void main(String args[]){
        int arr[][] = {{1, 2, 3, 4, 5, 6},{ 7, 8, 9,10, 11, 12,}, {13, 14, 15, 16 , 17 , 18}};

        spiralPrintMatrix(arr);
    }
}
