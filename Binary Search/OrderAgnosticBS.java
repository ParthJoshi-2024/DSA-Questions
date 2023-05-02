// Optimised Binary Search, it works for both types of sorted array i.e. ascending and descending.
public class OrderAgnosticBS {
    public static void main(String[] args) {
        // int arr[] = { 2, 3, 4, 5, 6, 8, 9 };
        int arr[] = {9,8,7,4,3,2,1};
        int target = 8;
        System.out.println(binarySearch(arr, target));

    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }
        return -1;
    }
}
