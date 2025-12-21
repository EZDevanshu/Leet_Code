class Solution {
    public int maxTotalFruits(int[][] fruits, int startPos, int k) {
        int max = 0 , sum = 0 , left = 0;

        for(int right = 0 ; right < fruits.length ; right++){
            sum += fruits[right][1];

            while(left <= right && (minStep(fruits[left][0] , fruits[right][0] , startPos) > k)){
                sum -= fruits[left][1];
                left++;
            }

            max = Math.max(max , sum);
        }
        return max ;
    }
        static int minStep(int left , int right , int start){
             int trivalLeft  = Math.abs(start - left) + (right - left);
             int trivalRight = Math.abs(right - start) + (right - left);

             return Math.min(trivalLeft , trivalRight);
        }
}