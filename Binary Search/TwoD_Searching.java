//you have to search a target element in a 2d array, rows are sorted and columns are sorted.

import java.util.Arrays;

public class TwoD_Searching {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{
            {10,20,30,40},
            {11,22,33,44},
            {12,24,36,48},
            {13,39,51,65}
    };
    System.out.print("The target is at :: ");
    System.out.println(Arrays.toString(search(matrix,39)));
    
}
    static int[] search(int[][] matrix, int target){
        int row = 0;
        int col = matrix[row].length -1;
        while(row<=matrix.length-1 && col>=0){
            if(target == matrix[row][col]){
                return new int[]{row,col};
            }
            if(target > matrix[row][col]){
                row++;
            }
            else{
                col--;
            }
        }
        return new int[]{-1,-1};
    }

}
