class Solution {
    public int minEatingSpeed(int[] arr, int h) {
        int low = 1 , high = 0 ;

        // max of array
        for(int a : arr){
            high = Math.max(a, high);
        }

        int ans = high;

        while (low <= high) {
            int mid = low + (high - low) / 2; // calculate speed
            long hours = 0;

            for(int x : arr){
                hours += (x + mid - 1) / mid;
            }

            if(hours <= h){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }
}


class Leet_875{
     public static void main(String[] args) {
        int arr[] = {3,6,7,11};
        int h = 8;

        Solution obj = new Solution();
        int ans = obj.minEatingSpeed(arr , h);

        System.out.println(ans);
    }
}