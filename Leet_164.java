import java.util.*;

class Solution {
    public int maximumGap(int[] nums) {
        if(nums == null || nums.length < 2){
            return 0;
        }
        Arrays.sort(nums);

        int maxGap = 0;

        for(int i = 0 ; i < nums.length - 1; i++){
            maxGap = Math.max(maxGap ,nums[i + 1] - nums[i]);
        }

        return maxGap; 
    }
}

class Leet_164{
    public static void main(String[] args) {
        int arr[] = {3,6,9,10};

        Solution obj = new Solution();

        System.out.println(obj.maximumGap(arr));
    }
}