// Binary search works on Sorted array,so either you have to provide the sorted array otherwise you have to sort the array
public class BinarySearchBasicProg {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
        int target = 8;
        int returned = binarySearch(arr, target);
        System.out.println("Element is at :: " + returned);
    }

    static int binarySearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // int mid = (start + end) / 2;
            int mid = start + (end - start) / 2; // more optimised way to calculate mid
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid; // answer is always found at mid
            }

        }
        return -1;
    }
}