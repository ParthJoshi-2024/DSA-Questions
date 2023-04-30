import java.util.Arrays;

public class TwoDArraySearch{
    public static void main(String[] args){
        int[][] arr = new int[][]{
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16,17}
        };
        int target = 15;
        int[] result = search(arr,target);
        System.out.println(Arrays.toString(result));
    }
    static int[] search(int[][] arr,int target){
        if(arr.length == 0){
            return new int[]{-1,-1};
        }
        for(int i=0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                if(arr[i][j] == target){
                    return new int[]{i,j};
                }
            }

        }
        return new int[]{-1,1};
    }
}