import java.util.Arrays;
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];

        // multiplication for left side...
        result[0] = 1;
        for(int i = 1 ; i < nums.length ; i++){
            result[i] = result[i - 1] * nums[i - 1];
        }

        // right side multiplication......
        int rightSideMultiplication = 1;
        for(int i = nums.length - 1 ; i >= 0 ; i--){
            result[i] *= rightSideMultiplication;
            rightSideMultiplication *= nums[i];
        }
        return result;
    }
}

class Leet_238{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};

        Solution obj = new Solution();
        int[] ans = obj.productExceptSelf(arr);

        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(ans[i]+",");
        }
    }
}