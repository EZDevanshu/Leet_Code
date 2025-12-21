class Solution {
    public int search(int[] nums, int target) {
        
        int start = 0 ;
        int end = nums.length - 1 ;

        while(start <= end){
            int mid = start + (end - start) / 2 ;
            if(target < nums[mid] ){
                end = mid - 1 ;
            }else if(target > nums[mid] ){
                start = mid + 1 ;
            }else{
                return mid;
            }
        }
        return -1 ;
    }
}

public class Leet_704{
    public static void main(String[] args) {
        int arry [] = {-1,0,3,5,9,12};
        int target = 9 ;

        Solution obj = new Solution();
        int ans = obj.search(arry , target);

        System.out.println(ans);
    }
}