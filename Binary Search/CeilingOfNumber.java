// import java.util.Arrays;
// Ceiling of a Number = Smallest number greater than or equal to the target
public class CeilingOfNumber{
    public static void main(String[] args) {
        int[] arr = {-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
        int target = 23;
        // System.out.println("Array is " + Arrays.toString(arr));
        // System.out.println("Target is " + target);
        System.out.println("Ceiling of the target is " + ceiling(arr,target));
    }
    static int ceiling(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            if(target> arr[arr.length-1])
                return -1;
            int mid = (start + end) / 2;
            if(target<arr[mid]){
                end = mid - 1;
            }
            else if(target>arr[mid]){
                start = mid + 1;
            }
            else{
                return arr[mid];
            }
        }
        return arr[start];

    }
}