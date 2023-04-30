public class LC_EvenDigits {
    public static void main(String[] args) {
        int[] nums = new int[]{12,345,2,6,7896};
        System.out.println(evenDigit(nums));
    }
    static int evenDigit(int[] nums){
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(even(nums[i])){
                count++;
            }
        }
        return count;
    } 
    static boolean even(int num){
        if(num == 0){
            return false;
        }
        int digit = 0;
        while(num!=0){
            num = num/10;
            digit++;
        }
       return digit%2==0;
    }
}
