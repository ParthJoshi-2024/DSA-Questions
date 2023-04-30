public class MinInArray {
    public static void main(String[] args) {
        int[] arr = {1,4,5,8,9,7,4,0};
        // int[] arr = new int[0];  the case in which the length of array is 0.
        System.out.println(minimum(arr));
    }
    static int minimum(int[] arr){
        if(arr.length == 0){
            return Integer.MIN_VALUE;
        }
        int ans = arr[0];
        for(int i = 0;i<arr.length;i++){
            if(arr[i]<ans){
                ans = arr[i];
            }

        }
        return ans;
    }
}
