class Solution {
    public int pivotIndex(int[] nums) {
        int tSum = 0;
        for(int x : nums){
            tSum += x;
        }
        int rSum = tSum;
        int lSum = 0;
        for(int i = 0 ; i < nums.length ; i++){

            lSum = tSum - rSum;
            rSum = tSum - lSum - nums[i];

            if(lSum == rSum){
                return i;
            }
        }
        return -1;
    }
}
class Leet_724{
    public static void main(String[] args) {

        int []arr = {2,1,-1};

        Solution obj = new Solution();
        int ans = obj.pivotIndex(arr);

        System.out.print(ans);
    }
}