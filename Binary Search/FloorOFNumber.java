// import java.util.Arrays;
// Floor of a Number means greatest number smaller than or equal to target.
public class FloorOFNumber {
    public static void main(String[] args) {
        int arr[] = {2,3,5,9,14,16,18};
        int target = 13;
        // System.out.println("Array is "  + Arrays.toString(arr));
        // System.out.println("Target is " + target);
        System.out.println("Floor Of the target is " + floor(arr,target));
    }
    static int floor(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        if(arr.length == 0){
            return -1;
        }
        if(target < arr[0]){
            return -1;
        }
        while(start<=end){
            int mid = start + (end - start)/2;
            if(target<arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                return arr[mid];
            }
        }
        return arr[end];
    }
}
