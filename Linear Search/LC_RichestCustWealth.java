public class LC_RichestCustWealth {
    public static void main(String[] args) {
        int[][] accounts = new int[][]{
            {1,2,3},
            {3,2,1}
        };
        System.out.println(maximumWealth(accounts));
    }
    public static int maximumWealth(int[][] accounts){
        // row  = person
        // columns = account
        int maxSum = 0;
        for(int person = 0;person<accounts.length;person++){
            int sum = 0;
            for(int account = 0; account<accounts[person].length;account++){
                sum = sum + accounts[person][account];
            }
            if(sum > maxSum){
                maxSum = sum;
            }
        }
        return maxSum;
    }
}
