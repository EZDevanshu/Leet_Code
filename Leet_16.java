import java.util.*;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        Arrays.sort(nums);
        int result = nums[0] + nums[1] + nums[2];

        for(int i = 0 ; i < nums.length - 2 ; i++){

            if(i > 0 && nums[i] == nums[i - 1]){
                continue;
            }

            int left = i + 1 ; 
            int right = nums.length - 1;

            while(left < right){

                int sum = nums[i] + nums[left] + nums[right];

                if(sum == target){
                    return sum;
                }

                if(Math.abs(result - target) > Math.abs(sum - target)){
                    result = sum;
                }

                if(sum > target){
                    right--;
                }
                else{
                    left++;
                }
            }
        }
        return result;
    }
}

class Leet_16{
    public static void main(String[] args) {
        int []arr = {-1,2,1,-4};
        int target = 1;

        Solution obj = new Solution();

        int ans = obj.threeSumClosest(arr, target);

        System.out.println(ans);
    }
}