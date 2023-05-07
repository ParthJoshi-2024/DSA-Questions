// Time Complexity - Best Case :: O(1) , Worst Case :: O(N^2)
// Space Complexity - O(1) :: no extra array has been taken

import java.util.Arrays;

public class BubbleSort{
    public static void main(String[] args) {
        int[] arr = new int[]{0,29,1,80,6,800,5,32};
        System.out.println(Arrays.toString(bubbleSorting(arr)));
    }
    static int[] bubbleSorting(int[] arr){
        
       for (int i = 0; i <= arr.length-1; i++) {
            for (int j = 1; j <= arr.length - 1 - i; j++) {
                int temp;
                if(arr[j]<arr[j-1]){
                temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                }
            }
       
        }
        return arr;
    }
}