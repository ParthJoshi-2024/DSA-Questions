public class TwoDArrayMaxNum {
    public static void main(String[] args) {
        int[][] arr = new int[][]{
            {1,2,3,4},
            {4,5,6,7},
            {10,20,50,60}
        };
        int result = max(arr);
        System.out.println(result);
    }
    static int max(int[][] arr){
        if(arr.length == 0){
            return -1;
        }
        int maxNum = arr[0][0];
        for(int i =0; i<arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                if(arr[i][j]>maxNum){
                    maxNum = arr[i][j];
                }
            }
        }
        return maxNum;
    }
}
