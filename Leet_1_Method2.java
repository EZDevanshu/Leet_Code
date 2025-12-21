import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
    	HashMap <Integer , Integer> map = new HashMap<>();

    	for(int i = 0 ; i<nums.length ; i++){
    		int complement = target - nums[i];

    		if(map.containsKey(complement)){
    			return new int []{map.get(complement) , i};
    		}
    		map.put(nums[i] , i);
    	}
    		return new int [] {-1 , -1};
    }
}
public class Leet_1_Method2{
	public static void main(String[] args) {
		int arr[] = {3,2,4};
		int target = 6 ;

		Solution obj = new Solution();
		int ans[] = obj.twoSum(arr,target);
		System.out.println(Arrays.toString(ans));
	}
}