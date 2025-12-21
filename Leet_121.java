class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;

        int res = Integer.MIN_VALUE;

        for(int i=0; i<prices.length; i++) {
            if(min > prices[i]) min = prices[i];

            int var = prices[i] -min;

            res = Math.max(res , var);
        }
        return res;
    }
}

class Leet_121{
    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};

        Solution obj = new Solution();

        int ans = obj.maxProfit(arr);
        System.out.println(ans);
    }
}