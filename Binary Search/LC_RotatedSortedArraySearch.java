public class LC_RotatedSortedArraySearch {
    public static void main(String[] args) {
        int[] arr = new int[]{5,6,0,1,2,3,4};
        int target = 6;
        int pivot = findPivot(arr);
        System.out.println("The Pivot element is " + arr[pivot]);
        int search = searching(arr,target,pivot);
        System.out.println("Elemet Searching is at :: " + search);
    }
    static int searching(int[] arr, int target, int pivot){
        if(pivot==-1)
            return binarySearch(arr, target, 0, arr.length-1);
        if(arr[pivot] == target)
            return pivot;
        if(target>arr[0]){
            return binarySearch(arr,target,0,pivot-1);
        }
        return binarySearch(arr,target,pivot+1,arr.length-1);
    }
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = (start + end)/2;
            if(mid<end && arr[mid]>arr[mid+1])
                return mid;
            if(mid>start && arr[mid-1]>arr[mid])
                return mid-1;
            if(arr[start]>arr[mid]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }
    static int binarySearch(int[] arr, int target, int start, int end){
        while(start<=end){
            int mid = (start+end)/2;
            if(target<arr[mid])
                end = mid-1;
            else if(target>arr[mid])
                start = mid+1;
            else{
                return mid;
            }
        }
        return -1;
    }
}
