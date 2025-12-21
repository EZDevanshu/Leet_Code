import java.util.Arrays;
class Solution {
    public int[] twoSum(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int i = 0;

            while(start <= end){
                int sum = arr[start] + arr[end];

                if(sum == target){
                    return new int[]{start + 1 , end + 1};
                }
                else if(sum > target){
                    end--;
                }
                else{
                    start++;
                }
            }

        return new int[] {-1 , -1};
    }
}

class Leet_167{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int target = 6;

        Solution obj = new Solution();
        int[] ans = obj.twoSum(arr , target);

        System.out.println(Arrays.toString(ans));
    }
}