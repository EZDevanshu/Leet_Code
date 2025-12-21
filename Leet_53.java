class Solution {
    public int maxSubArray(int[] arr) {
        
        int res = arr[0];
        int sum = 0;

        for(int i = 0 ; i < arr.length ; i++){
            if(sum < 0){
                sum = 0;
            }

            sum = sum + arr[i];

            res = Math.max(res , sum);
        }

        return res;
    }
}

class Leet_53{
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};

        Solution obj = new Solution();
        int ans = obj.maxSubArray(arr);

        System.out.println(ans);
    }
}