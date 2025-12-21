class Solution {
    public int findMin(int[] nums) {
        int pivot = findPivot(nums);
        return (pivot == -1) ? nums[0] : nums[pivot + 1];
    }

    public int findPivot(int [] arr){
        int start = 0 ;
        int end = arr.length - 1 ;

        while(start <= end){
            int mid = start + (end - start) / 2 ;

            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid ;
            }
            else if(mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1 ;
            }
            if(arr[start] >= arr[mid]){
                end = mid - 1 ;
            }
            else{
                start = mid + 1 ;
            }
        }
        return -1;
    }
}

public class Leet_153{
    public static void main(String[] args) {
        int []arr = {11,13,15,17};

        System.out.println(new Solution().findMin(arr));
    }
}