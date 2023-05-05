public class LC_PeakIndexInMountainArr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,7,10,6,3,2};
        System.out.println(binarySearch(arr));
    }
    static int binarySearch(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
        int mid = (start + end)/2;
        if(arr[mid]>arr[mid+1]){
            end = mid;
        }
        else{
            start = mid+1;
        }

        }
        return start;
    }
}
