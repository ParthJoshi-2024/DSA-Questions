public class GFG_RotationCountRotatedSortedArray{
    public static void main(String[] args) {
        int[] arr = new int[]{8,9,1,2,3,4,5};
        System.out.println(findPivot(arr) + 1);
        
    }
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(mid < end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid > start && arr[mid-1]>arr[mid]){
                return mid-1;
            }
            if(arr[start]<=arr[mid]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
}