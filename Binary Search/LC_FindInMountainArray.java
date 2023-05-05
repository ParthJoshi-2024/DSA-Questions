public class LC_FindInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1,3,5,4,7,6,4,2,0};
        int target = 10;
        System.out.println(ans(arr,target));
    }
    static int ans(int[] arr, int target){
        int peak = peakIndex(arr, target);
        int firstTry = binarySearch(arr,target,0,peak);
        if(firstTry != -1){
            return firstTry;
        }
        return binarySearch(arr, target, peak+1, arr.length-1);
    }

    static int peakIndex(int[] arr, int target){
        int start = 0;
        int end = arr.length- 1;
        while(start<end){
            int mid = start + (end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end = mid;
            }
            else{
                start = mid+1;
            }
        }
        return start;
    }

    static int binarySearch(int[] arr, int target, int start, int end){
        while(start<end){
            int mid = start + (end-start)/2;
            if(target>arr[mid])
                start = mid+1;
            else if(target<arr[mid])
                end = mid-1;
            else
                return mid;
        }
        return -1;
    }
    
}

