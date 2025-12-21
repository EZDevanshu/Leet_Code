import java.util.*;
class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int l = 0;
        int r = k - 1;
        int res = 0;
        int ans = Integer.MAX_VALUE;

        if(nums.length == 1 || k == 1){
            return 0;
        }
        while(l < r && r < nums.length){
            if(r - l + 1 == k){
                res = nums[r] - nums[l];
            }
            l++;
            r++;
            ans = Math.min(ans , res);
        }
        return ans;
    }
}

class Leet_1984{
    public static void main(String[] args) {

        int arr[] = {30266,74974,6275,5926};
        int k = 1;
        Solution obj = new Solution();
        int ans = obj.minimumDifference(arr , k);

        System.out.println(ans);
    }
}