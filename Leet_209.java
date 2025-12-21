class Solution {
    public int minSubArrayLen(int target, int[] arr) {
        int i = 0;
        int j = 0;

        int sum = 0;
        int minimum = Integer.MAX_VALUE;

        while(j < arr.length){
            sum += arr[j];

            while(sum >= target){
                minimum = Math.min(minimum , j - i + 1);
                sum -= arr[i];
                i++;
            }
            j++;
        }

        return minimum == Integer.MAX_VALUE ? 0 : minimum;
    }
}

class Leet_209{
    public static void main(String[] args) {
        int arr[] = {2,3,1,2,4,3};
        int target = 7;

        Solution obj = new Solution();
        int ans = obj.minSubArrayLen(target , arr);

        System.out.println(ans);
    }
}